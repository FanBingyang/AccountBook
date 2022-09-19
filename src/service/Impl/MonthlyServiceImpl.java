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
 * @Author:范秉洋
 * @Date:2019/8/28 13:15
 */
@Service
public class MonthlyServiceImpl implements MonthlyService {

    @Autowired
    private MonthlyBillMapper monthlyBillMapper;

    @Autowired
    private ExpenseService expenseService;

    /**
     * 创建月账单
     * @param monthlyBill
     * @return
     */
    @Override
    public int insertMonthly(MonthlyBill monthlyBill) {
        return monthlyBillMapper.insertSelective(monthlyBill);
    }

    /**
     * 根据账单id查询账单
     * @param monthlyId
     * @return
     */
    @Override
    public MonthlyBill selectById(Integer monthlyId) {
        return monthlyBillMapper.selectByPrimaryKey(monthlyId);
    }

    /**
     * 根据条件(账单时间)进行模糊查询
     * @param monthlyBill
     * @return
     */
    @Override
    public List<MonthlyBill> selectByExample(MonthlyBill monthlyBill) {
        MonthlyBillExample example = new MonthlyBillExample();
        MonthlyBillExample.Criteria criteria = example.createCriteria();
        //设置用户id
        criteria.andOpenIdEqualTo(monthlyBill.getOpenId());
        //如果查询条件(时间)不为空，添加该条件
        if(monthlyBill.getMonthlyTime() != null && monthlyBill.getMonthlyTime().length() > 0){
            criteria.andMonthlyTimeLike("%" + monthlyBill.getMonthlyTime() + "%");
        }

        return monthlyBillMapper.selectByExample(example);
    }

    /**
     * 根据id返回两张账单，用于比较两次月消费情况
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
     * 创建月账单，包含本月的所有消费情况
     */
    @Override
    public void creatMonthly() {
        //获取到已经创建好的月账单
        List<MonthlyBill> list = expenseService.summaryExpense();
        //遍历列表中的账单，依次写入数据库
        for (MonthlyBill m:list) {
            monthlyBillMapper.insertSelective(m);
        }
    }

    /**
     * 统计本年度的所有消费情况，创建年账单，
     * @return
     */
    @Override
    public List<MonthlyBill> allMonthly() {
        //时间设置为上一个年，因为账单统计是年度结束之后进行统计的，统计的是上一年的
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); // 设置为当前时间
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 1); // 设置为上一年
        date = calendar.getTime();
        String monthly_time = format.format(date);
        //返回所用用户一年的消费情况，以月账单的形式进行返回，创建年账单的时候进行年账单形式的转换
        return monthlyBillMapper.allMonthly(monthly_time);
    }



}
