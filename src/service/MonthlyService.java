package service;

import pojo.MonthlyBill;
import pojo.MonthlyBillExample;
import pojo.YearlyBill;

import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/28 13:03
 */
public interface MonthlyService {

    //����һ�����˵�
    int insertMonthly(MonthlyBill monthlyBill);

    //�����˵�id��ѯ
    MonthlyBill selectById(Integer monthlyId);

    //�����������в�ѯ(����)
    List<MonthlyBill> selectByExample(MonthlyBill monthlyBill);

    //�ȶ������µ��������
    List<MonthlyBill> compareMonthly(Integer id_1,Integer id_2);

    //�������˵�
    void creatMonthly();

    //ͳ��12���µ������������������һ���ܵ����ѣ����ڴ������˵�
    List<MonthlyBill> allMonthly();



}
