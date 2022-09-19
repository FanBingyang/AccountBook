package service;

import pojo.MonthlyBill;
import pojo.YearlyBill;

import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/28 16:09
 */
public interface YearlyService {

    //����һ�����˵�
    int insertYearthly(YearlyBill yearlyBill);

    //�����˵�id��ѯ
    YearlyBill selectById(Integer yearId);

    //�����������в�ѯ(����)
    List<YearlyBill> selectByExample(YearlyBill yearlyBill);

    //�Ա�������������
    List<YearlyBill> compareYearly(Integer id_1,Integer id_2);

    //�������˵�
    int creatYearly();

}
