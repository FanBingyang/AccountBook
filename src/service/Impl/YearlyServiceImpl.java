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
 * @Author:������
 * @Date:2019/8/28 16:14
 */
@Service
public class YearlyServiceImpl implements YearlyService {

    @Autowired
    private YearlyBillMapper yearlyBillMapper;

    @Autowired
    private MonthlyService monthlyService;

    /**
     * д���µ����˵�
     * @param yearlyBill
     * @return
     */
    @Override
    public int insertYearthly(YearlyBill yearlyBill) {
        return yearlyBillMapper.insert(yearlyBill);
    }

    /**
     * ����id��ѯ���˵�
     * @param yearId
     * @return
     */
    @Override
    public YearlyBill selectById(Integer yearId) {
        return yearlyBillMapper.selectByPrimaryKey(yearId);
    }

    /**
     * ��������(ʱ��)��ѯ���˵�
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
     * ����id�����������˵������ڶԱ��������
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
     * �������˵�
     * @return
     */
    @Override
    public int creatYearly() {
        //�Ȳ�ѯ�������Ѿ����ܵ����˵�
        List<MonthlyBill> mList = monthlyService.allMonthly();
        System.out.println("mList="+mList);
        //ѭ���������˵��б��е��˵���Ȼ��Ѷ�Ӧ��������Ϊ���˵���֮��������˵���д��
        for (MonthlyBill m:mList) {
            //�������˵�����
            YearlyBill y = new YearlyBill();
            //�ӻ��ܵ����˵��л�ȡ��Ӧ�����Խ�������
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
            //ʱ��ֻҪ���˵���ǰ��λʱ�䣬Ҳ�������
            y.setYearlyTime(m.getMonthlyTime().substring(0,4));
            System.out.println(y.toString());
            yearlyBillMapper.insert(y);
        }
        return 1;
    }
}
