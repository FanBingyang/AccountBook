package service;

import pojo.Expense;
import pojo.MonthlyBill;
import pojo.PageInfo;

import java.util.List;

/**
 * @Author:������
 * @Date:2019/8/26 23:02
 */
public interface ExpenseService {

    //���һ����ͨ����
    int insertExpense(Expense expense);

    //�����˵�idɾ��һ����ͨ����
    int deleteExpense(Integer expenseId);

    //�޸����Ѽ�¼
    Expense updateExpenseById(Expense expense);

    //��ҳ��ѯ
    List<Expense> selectExpenseByLimit(PageInfo pageInfo);

    //���˵�id���в�ѯ
    Expense selectExpenseById(Integer expenseId);

    //��������ѯ���Ѽ�¼
    List<Expense> selectExpenseByExample(Expense expense);

    //����ÿ���û��������������ͳ�Ƴ����˵�����ʽ����
    List<MonthlyBill> summaryExpense();

    //��ѯ���������ܽ��
    float selectTotal(String openId);




}
