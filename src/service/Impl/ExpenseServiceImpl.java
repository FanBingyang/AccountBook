package service.Impl;

import mapper.ExpenseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Expense;
import pojo.ExpenseExample;
import pojo.MonthlyBill;
import pojo.PageInfo;
import service.ExpenseService;
import util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author:������
 * @Date:2019/8/26 23:29
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseMapper expenseMapper;

    /**
     * �������Ѽ�¼
     * @param expense
     * @return
     */
    @Override
    public int insertExpense(Expense expense) {

        //���û������ʱ�䣬����������ʱ��Ϊ��ǰʱ��
        if(expense.getExpenseTime() == null || expense.getExpenseTime().length() <= 0){
            String date = DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss");
            expense.setExpenseTime(date);
        }
        //���û�����ѱ��⣬Ĭ��������ʱ�� ��-��-��
        if(expense.getExpenseTitle() == null || expense.getExpenseTitle().length() <= 0)
        {
            expense.setExpenseTitle(expense.getExpenseTime().substring(0,10));
        }
        //���û�б�ע��Ĭ����:��
        if(expense.getExpenseExplain() == null || expense.getExpenseExplain().length() <= 0)
        {
            expense.setExpenseExplain("��");
        }

        return expenseMapper.insertSelective(expense);
    }

    /**
     * ����idɾ�����Ѽ�¼
     * @param expenseId
     * @return
     */
    @Override
    public int deleteExpense(Integer expenseId) {
        return expenseMapper.deleteByPrimaryKey(expenseId);
    }

    /**
     * �޸����Ѽ�¼
     * @param expense
     * @return
     */
    @Override
    public Expense updateExpenseById(Expense expense) {
        //�Ƚ����޸�
        expenseMapper.updateByPrimaryKeySelective(expense);
        //�޸���֮���ѯ����
        return expenseMapper.selectByPrimaryKey(expense.getExpenseId());
    }

    /**
     * ��ҳ��ѯ�������Ѽ�¼
     * @return
     */
    @Override
    public List<Expense> selectExpenseByLimit(PageInfo pageInfo) {
        return expenseMapper.selectExpenseByLimit(pageInfo);
    }

    /**
     * ����id��ѯ���Ѽ�¼
     * @param expenseId
     * @return
     */
    @Override
    public Expense selectExpenseById(Integer expenseId) {
        return expenseMapper.selectByPrimaryKey(expenseId);
    }

    /**
     * ����������ѯ���Ѽ�¼�������ǣ����ѱ��������ʱ��ģ����ѯ
     * @param expense
     * @return
     */
    @Override
    public List<Expense> selectExpenseByExample(Expense expense) {
        System.out.println("���Ѳ�ѯexpense��"+expense.toString());

        //������ѯ��������û���������ǲ�ѯ����
        ExpenseExample example = new ExpenseExample();
        ExpenseExample.Criteria criteria = example.createCriteria();
        //�����û�id
        criteria.andOpenIdEqualTo(expense.getOpenId());
        //�����ѯ���ⲻΪ�գ�����Ϊ��ѯ����
        if(expense.getExpenseTitle() != null && expense.getExpenseTitle().length() > 0)
        {
            criteria.andExpenseTitleLike("%" + expense.getExpenseTitle() + "%");
        }
        //�����ѯʱ�䲻Ϊ�գ�����Ϊ��ѯ����
        if(expense.getExpenseTime() != null && expense.getExpenseTime().length() > 0){
            criteria.andExpenseTimeLike("%" + expense.getExpenseTime() + "%");
        }
        //�����ѯ�������Ͳ�Ϊ�գ�����Ϊ��ѯ����
        if(expense.getExpenseCategory() != null && expense.getExpenseCategory().length() > 0){
            criteria.andExpenseCategoryEqualTo(expense.getExpenseCategory());
        }
        return expenseMapper.selectByExample(example);
    }

    @Override
    public float selectTotal(String openId) {
        String time = DateUtil.CreatStringTime("yyyy-MM-dd");
        float total;
        if(expenseMapper.selectTotal(openId,time) != null)
        {
            total = expenseMapper.selectTotal(openId,time);
        }
        else total = 0;
        return total;
    }

    /**************************����ķ����ǻ���������������ڴ������˵�************************/

    @Override
    public List<MonthlyBill> summaryExpense() {
        //ʱ������Ϊ��һ���꣬��Ϊ�˵�ͳ������Ƚ���֮�����ͳ�Ƶģ�ͳ�Ƶ�����һ���
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // ����Ϊ��ǰʱ��
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // ����Ϊ��һ����
        date = calendar.getTime();
        String month = format.format(date);
        System.out.println("====="+month);

        //���������·�����������������û���open_id
        List<String> idList = expenseMapper.selectOpenIdList(month);
        System.out.println(idList);
        //����һ�����˵�list
        List<MonthlyBill> list = new ArrayList<>();
        //�����û���open_id
        for (String open_id:idList)
        {
            //����Ҫ���в�ѯ���û�open_id�Ͳ�ѯ���·ݽ��з�װ��
            // ��Ϊmybatis��xml�ļ���sql���Ҫ����ն��������������������
            // ����һ����װ��pojo���д��Σ�
            // ����������װ��Map���д��Ρ�sql����н��ղ�����������Ҫ��map�е�һ��
            //       eg:�ӿ��еķ�����List<Expense> selectAllByOpenId(Map map);
            //          ���õķ�����List<Expense> expenseList = expenseMapper.selectAllByOpenId(map);
            // ����������mapper�ӿڷ����д���@Param("open_id")ע�⣬����ע������������������ƾ���xml��sql����ȡ����������
            //       eg:�ӿ��еķ�����List<Expense> selectAllByOpenId(@Param("open_id")String open_id,@Param("expense_time")String month);
            //          ���õķ�����List<Expense> expenseList = expenseMapper.selectAllByOpenId(open_id,month);
            Map map = new HashMap();
            map.put("open_id",open_id);
            map.put("expense_time",month);
            //��ѯ�����û������������͵Ļ���
            List<Expense> expenseList = expenseMapper.selectAllByOpenId(map);
//            System.out.println("=========="+expenseList);
            //����һ����ʱ���˵�
            MonthlyBill monthlyBill = new MonthlyBill();
            //�����û�open_id
            monthlyBill.setOpenId(open_id);
            //����ͳ�������ܽ��
            float total = 0;
            //�Բ�ѯ�����û������������͵Ļ��ܵ��˵����б�����
            //��Ϊÿһ���˵���һ���������͵Ļ��ܣ�����Ҫ�����Ƕ�����������Ȼ���װ��һ�����˵�
            for (Expense expense:expenseList)
            {
                //�Ա����������˵������ж��������������͵Ļ��ܣ�Ȼ���װ�����˵������ҽ����ѽ��ӵ��ܽ����
                if(expense.getExpenseCategory().equals("��ʳ")){
                    monthlyBill.setMonthlySnacks(expense.getExpenseMoney());
                    total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("��ͨ")){
                    monthlyBill.setMonthlyFare(expense.getExpenseMoney());
                    total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("ס��")){
                        monthlyBill.setMonthlyStay(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("����")){
                        monthlyBill.setMonthlyRepast(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("����")){
                        monthlyBill.setMonthlyRecreation(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("��װ")){
                        monthlyBill.setMonthlyClothing(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("�ճ�")){
                        monthlyBill.setMonthlyDaily(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("����")){
                        monthlyBill.setMonthlyOther(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
//                System.out.println("expense==="+expense.toString());
            }
            //�������˵��������ѽ��
            monthlyBill.setMonthlyTotal(total);
            //�����˵�ʱ��
            monthlyBill.setMonthlyTime(month);
            //����ʱ���˵���ӽ����˵��б��У�
            list.add(monthlyBill);

//            System.out.println("---->"+monthlyBill.toString());
        }

        //����װ�õ����˵��б���з��أ��������˵������
        return list;
    }
}
