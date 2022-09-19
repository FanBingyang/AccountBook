package service;

import pojo.Expense;
import pojo.MonthlyBill;
import pojo.PageInfo;

import java.util.List;

/**
 * @Author:范秉洋
 * @Date:2019/8/26 23:02
 */
public interface ExpenseService {

    //添加一次普通消费
    int insertExpense(Expense expense);

    //根据账单id删除一次普通消费
    int deleteExpense(Integer expenseId);

    //修改消费记录
    Expense updateExpenseById(Expense expense);

    //分页查询
    List<Expense> selectExpenseByLimit(PageInfo pageInfo);

    //按账单id进行查询
    Expense selectExpenseById(Integer expenseId);

    //按条件查询消费记录
    List<Expense> selectExpenseByExample(Expense expense);

    //汇总每个用户的月消费情况，统计成月账单的形式返回
    List<MonthlyBill> summaryExpense();

    //查询当日消费总金额
    float selectTotal(String openId);




}
