package service;

import pojo.MonthlyBill;
import pojo.YearlyBill;

import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/28 16:09
 */
public interface YearlyService {

    //新增一个年账单
    int insertYearthly(YearlyBill yearlyBill);

    //根据账单id查询
    YearlyBill selectById(Integer yearId);

    //根据条件进行查询(日期)
    List<YearlyBill> selectByExample(YearlyBill yearlyBill);

    //对比两年的消费情况
    List<YearlyBill> compareYearly(Integer id_1,Integer id_2);

    //创建年账单
    int creatYearly();

}
