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
 * @Author:范秉洋
 * @Date:2019/8/26 23:29
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseMapper expenseMapper;

    /**
     * 新增消费记录
     * @param expense
     * @return
     */
    @Override
    public int insertExpense(Expense expense) {

        //如果没有消费时间，就设置消费时间为当前时间
        if(expense.getExpenseTime() == null || expense.getExpenseTime().length() <= 0){
            String date = DateUtil.CreatStringTime("yyyy-MM-dd HH:mm:ss");
            expense.setExpenseTime(date);
        }
        //如果没有消费标题，默认是消费时间 年-月-日
        if(expense.getExpenseTitle() == null || expense.getExpenseTitle().length() <= 0)
        {
            expense.setExpenseTitle(expense.getExpenseTime().substring(0,10));
        }
        //如果没有备注，默认是:无
        if(expense.getExpenseExplain() == null || expense.getExpenseExplain().length() <= 0)
        {
            expense.setExpenseExplain("无");
        }

        return expenseMapper.insertSelective(expense);
    }

    /**
     * 根据id删除消费记录
     * @param expenseId
     * @return
     */
    @Override
    public int deleteExpense(Integer expenseId) {
        return expenseMapper.deleteByPrimaryKey(expenseId);
    }

    /**
     * 修改消费记录
     * @param expense
     * @return
     */
    @Override
    public Expense updateExpenseById(Expense expense) {
        //先进行修改
        expenseMapper.updateByPrimaryKeySelective(expense);
        //修改完之后查询出来
        return expenseMapper.selectByPrimaryKey(expense.getExpenseId());
    }

    /**
     * 分页查询所有消费记录
     * @return
     */
    @Override
    public List<Expense> selectExpenseByLimit(PageInfo pageInfo) {
        return expenseMapper.selectExpenseByLimit(pageInfo);
    }

    /**
     * 根据id查询消费记录
     * @param expenseId
     * @return
     */
    @Override
    public Expense selectExpenseById(Integer expenseId) {
        return expenseMapper.selectByPrimaryKey(expenseId);
    }

    /**
     * 根据条件查询消费记录，条件是：消费标题或消费时间模糊查询
     * @param expense
     * @return
     */
    @Override
    public List<Expense> selectExpenseByExample(Expense expense) {
        System.out.println("消费查询expense："+expense.toString());

        //创建查询条件对象，没有条件则是查询所有
        ExpenseExample example = new ExpenseExample();
        ExpenseExample.Criteria criteria = example.createCriteria();
        //设置用户id
        criteria.andOpenIdEqualTo(expense.getOpenId());
        //如果查询标题不为空，设置为查询条件
        if(expense.getExpenseTitle() != null && expense.getExpenseTitle().length() > 0)
        {
            criteria.andExpenseTitleLike("%" + expense.getExpenseTitle() + "%");
        }
        //如果查询时间不为空，设置为查询条件
        if(expense.getExpenseTime() != null && expense.getExpenseTime().length() > 0){
            criteria.andExpenseTimeLike("%" + expense.getExpenseTime() + "%");
        }
        //如果查询消费类型不为空，设置为查询条件
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

    /**************************下面的方法是汇总月消费情况用于创建月账单************************/

    @Override
    public List<MonthlyBill> summaryExpense() {
        //时间设置为上一个年，因为账单统计是年度结束之后进行统计的，统计的是上一年的
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
        date = calendar.getTime();
        String month = format.format(date);
        System.out.println("====="+month);

        //遍历出该月份所有有消费情况的用户的open_id
        List<String> idList = expenseMapper.selectOpenIdList(month);
        System.out.println(idList);
        //创建一个月账单list
        List<MonthlyBill> list = new ArrayList<>();
        //遍历用户的open_id
        for (String open_id:idList)
        {
            //将需要进行查询的用户open_id和查询的月份进行封装，
            // 因为mybatis的xml文件中sql语句要想接收多个参数有以下三个方法
            // 方法一：封装成pojo进行传参，
            // 方法二：封装成Map进行传参。sql语句中接收参数的属性名要和map中的一致
            //       eg:接口中的方法：List<Expense> selectAllByOpenId(Map map);
            //          调用的方法：List<Expense> expenseList = expenseMapper.selectAllByOpenId(map);
            // 方法三：在mapper接口方法中打上@Param("open_id")注解，可以注解多个参数，里面的名称就是xml中sql语句获取参数的名称
            //       eg:接口中的方法：List<Expense> selectAllByOpenId(@Param("open_id")String open_id,@Param("expense_time")String month);
            //          调用的方法：List<Expense> expenseList = expenseMapper.selectAllByOpenId(open_id,month);
            Map map = new HashMap();
            map.put("open_id",open_id);
            map.put("expense_time",month);
            //查询出该用户所用消费类型的汇总
            List<Expense> expenseList = expenseMapper.selectAllByOpenId(map);
//            System.out.println("=========="+expenseList);
            //创建一个临时月账单
            MonthlyBill monthlyBill = new MonthlyBill();
            //设置用户open_id
            monthlyBill.setOpenId(open_id);
            //用于统计消费总金额
            float total = 0;
            //对查询出该用户所用消费类型的汇总的账单进行遍历，
            //因为每一个账单是一个消费类型的汇总，所以要把他们都遍历出来，然后封装成一个月账单
            for (Expense expense:expenseList)
            {
                //对遍历出来的账单进行判断是那种消费类型的汇总，然后封装进月账单，并且将消费金额加到总金额里
                if(expense.getExpenseCategory().equals("零食")){
                    monthlyBill.setMonthlySnacks(expense.getExpenseMoney());
                    total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("交通")){
                    monthlyBill.setMonthlyFare(expense.getExpenseMoney());
                    total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("住宿")){
                        monthlyBill.setMonthlyStay(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("餐饮")){
                        monthlyBill.setMonthlyRepast(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("娱乐")){
                        monthlyBill.setMonthlyRecreation(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("服装")){
                        monthlyBill.setMonthlyClothing(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("日常")){
                        monthlyBill.setMonthlyDaily(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
                if(expense.getExpenseCategory().equals("其他")){
                        monthlyBill.setMonthlyOther(expense.getExpenseMoney());
                        total += expense.getExpenseMoney();
                }
//                System.out.println("expense==="+expense.toString());
            }
            //设置月账单的总消费金额
            monthlyBill.setMonthlyTotal(total);
            //设置账单时间
            monthlyBill.setMonthlyTime(month);
            //将临时月账单添加进月账单列表中，
            list.add(monthlyBill);

//            System.out.println("---->"+monthlyBill.toString());
        }

        //将封装好的月账单列表进行返回，用于月账单的添加
        return list;
    }
}
