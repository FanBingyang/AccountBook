package service;

import pojo.MonthlyBill;
import pojo.MonthlyBillExample;
import pojo.YearlyBill;

import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/28 13:03
 */
public interface MonthlyService {

    //增加一个月账单
    int insertMonthly(MonthlyBill monthlyBill);

    //根据账单id查询
    MonthlyBill selectById(Integer monthlyId);

    //根据条件进行查询(日期)
    List<MonthlyBill> selectByExample(MonthlyBill monthlyBill);

    //比对两个月的消费情况
    List<MonthlyBill> compareMonthly(Integer id_1,Integer id_2);

    //创建月账单
    void creatMonthly();

    //统计12个月的所有消费情况，返回一个总的消费，用于创建年账单
    List<MonthlyBill> allMonthly();



}
