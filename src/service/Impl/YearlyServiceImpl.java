package service.Impl;

import mapper.MonthlyBillMapper;
import mapper.YearlyBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Expense;
import pojo.MonthlyBill;
import pojo.YearlyBill;
import pojo.YearlyBillExample;
import service.MonthlyService;
import service.YearlyService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/28 16:14
 */
@Service
public class YearlyServiceImpl implements YearlyService {

    @Autowired
    private YearlyBillMapper yearlyBillMapper;

    @Autowired
    private MonthlyService monthlyService;

    /**
     * 写入新的年账单
     * @param yearlyBill
     * @return
     */
    @Override
    public int insertYearthly(YearlyBill yearlyBill) {
        return yearlyBillMapper.insert(yearlyBill);
    }

    /**
     * 根据id查询年账单
     * @param yearId
     * @return
     */
    @Override
    public YearlyBill selectById(Integer yearId) {
        return yearlyBillMapper.selectByPrimaryKey(yearId);
    }

    /**
     * 根据条件(时间)查询年账单
     * @param yearlyBill
     * @return
     */
    @Override
    public List<YearlyBill> selectByExample(YearlyBill yearlyBill) {
        YearlyBillExample example = new YearlyBillExample();
        YearlyBillExample.Criteria criteria = example.createCriteria();

        criteria.andOpenIdEqualTo(yearlyBill.getOpenId());

        if(yearlyBill.getYearlyTime() != null && yearlyBill.getYearlyTime().length() > 0){
            criteria.andYearlyTimeLike("%"+ yearlyBill.getYearlyTime() +"%");
        }

        return yearlyBillMapper.selectByExample(example);
    }

    /**
     * 根据id返回两个年账单，用于对比消费情况
     * @param id_1
     * @param id_2
     * @return
     */
    @Override
    public List<YearlyBill> compareYearly(Integer id_1, Integer id_2) {
        List<YearlyBill> list = new ArrayList<>();

        YearlyBill y1 = yearlyBillMapper.selectByPrimaryKey(id_1);
        list.add(y1);
        YearlyBill y2 = yearlyBillMapper.selectByPrimaryKey(id_2);
        list.add(y2);

        return list;
    }

    /**
     * 创建年账单
     * @return
     */
    @Override
    public int creatYearly() {
        //先查询出所有已经汇总的月账单
        List<MonthlyBill> mList = monthlyService.allMonthly();
        System.out.println("mList="+mList);
        //循环遍历月账单列表中的账单，然后把对应属性设置为年账单，之后进行年账单的写入
        for (MonthlyBill m:mList) {
            //创建年账单对象
            YearlyBill y = new YearlyBill();
            //从汇总的月账单中获取对应的属性进行设置
            y.setOpenId(m.getOpenId());
            y.setYearlyFare(m.getMonthlyFare());
            y.setYearlySnacks(m.getMonthlySnacks());
            y.setYearlyStay(m.getMonthlyStay());
            y.setYearlyRepast(m.getMonthlyRepast());
            y.setYearlyRecreation(m.getMonthlyRecreation());
            y.setYearlyClothing(m.getMonthlyClothing());
            y.setYearlyDaily(m.getMonthlyDaily());
            y.setYearlyOther(m.getMonthlyOther());
            y.setYearlyTotal(m.getMonthlyTotal());
            //时间只要月账单的前四位时间，也就是年份
            y.setYearlyTime(m.getMonthlyTime().substring(0,4));
            System.out.println(y.toString());
            yearlyBillMapper.insert(y);
        }
        return 1;
    }
}
