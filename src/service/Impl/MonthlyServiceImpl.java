package service.Impl;

import mapper.MonthlyBillMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.MonthlyBill;
import pojo.MonthlyBillExample;
import pojo.YearlyBill;
import service.ExpenseService;
import service.MonthlyService;
import util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/28 13:15
 */
@Service
public class MonthlyServiceImpl implements MonthlyService {

    @Autowired
    private MonthlyBillMapper monthlyBillMapper;

    @Autowired
    private ExpenseService expenseService;

    /**
     * �������˵�
     * @param monthlyBill
     * @return
     */
    @Override
    public int insertMonthly(MonthlyBill monthlyBill) {
        return monthlyBillMapper.insertSelective(monthlyBill);
    }

    /**
     * �����˵�id��ѯ�˵�
     * @param monthlyId
     * @return
     */
    @Override
    public MonthlyBill selectById(Integer monthlyId) {
        return monthlyBillMapper.selectByPrimaryKey(monthlyId);
    }

    /**
     * ��������(�˵�ʱ��)����ģ����ѯ
     * @param monthlyBill
     * @return
     */
    @Override
    public List<MonthlyBill> selectByExample(MonthlyBill monthlyBill) {
        MonthlyBillExample example = new MonthlyBillExample();
        MonthlyBillExample.Criteria criteria = example.createCriteria();
        //�����û�id
        criteria.andOpenIdEqualTo(monthlyBill.getOpenId());
        //�����ѯ����(ʱ��)��Ϊ�գ���Ӹ�����
        if(monthlyBill.getMonthlyTime() != null && monthlyBill.getMonthlyTime().length() > 0){
            criteria.andMonthlyTimeLike("%" + monthlyBill.getMonthlyTime() + "%");
        }

        return monthlyBillMapper.selectByExample(example);
    }

    /**
     * ����id���������˵������ڱȽ��������������
     * @param id_1
     * @param id_2
     * @return
     */
    @Override
    public List<MonthlyBill> compareMonthly(Integer id_1, Integer id_2) {
        List<MonthlyBill> list = new ArrayList<>();
        MonthlyBill mBill1 = monthlyBillMapper.selectByPrimaryKey(id_1);
        list.add(mBill1);
        MonthlyBill mBill2 = monthlyBillMapper.selectByPrimaryKey(id_2);
        list.add(mBill2);
        return list;
    }


    /**
     * �������˵����������µ������������
     */
    @Override
    public void creatMonthly() {
        //��ȡ���Ѿ������õ����˵�
        List<MonthlyBill> list = expenseService.summaryExpense();
        //�����б��е��˵�������д�����ݿ�
        for (MonthlyBill m:list) {
            monthlyBillMapper.insertSelective(m);
        }
    }

    /**
     * ͳ�Ʊ���ȵ���������������������˵���
     * @return
     */
    @Override
    public List<MonthlyBill> allMonthly() {
        //ʱ������Ϊ��һ���꣬��Ϊ�˵�ͳ������Ƚ���֮�����ͳ�Ƶģ�ͳ�Ƶ�����һ���
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // ����Ϊ��ǰʱ��
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 1); // ����Ϊ��һ��
        date = calendar.getTime();
        String monthly_time = format.format(date);
        //���������û�һ�����������������˵�����ʽ���з��أ��������˵���ʱ��������˵���ʽ��ת��
        return monthlyBillMapper.allMonthly(monthly_time);
    }



}
