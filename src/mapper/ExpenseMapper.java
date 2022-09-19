package mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import pojo.Expense;
import pojo.ExpenseExample;
import pojo.PageInfo;

public interface ExpenseMapper {
    int countByExample(ExpenseExample example);

    int deleteByExample(ExpenseExample example);

    int deleteByPrimaryKey(Integer expenseId);

    int insert(Expense record);

    int insertSelective(Expense record);

    List<Expense> selectByExample(ExpenseExample example);

    Expense selectByPrimaryKey(Integer expenseId);

    int updateByExampleSelective(@Param("record") Expense record, @Param("example") ExpenseExample example);

    int updateByExample(@Param("record") Expense record, @Param("example") ExpenseExample example);

    int updateByPrimaryKeySelective(Expense record);

    int updateByPrimaryKey(Expense record);

    //分页查询
    List<Expense> selectExpenseByLimit(PageInfo pageInfo);

    //查询出某个月有消费情况的用户open_id
    List<String> selectOpenIdList(String month);

    //根据用户open_id统计出该用户本月所有消费情况的汇总
    List<Expense> selectAllByOpenId(Map map);
//    List<Expense> selectAllByOpenId(@Param("open_id")String open_id,@Param("expense_time")String month);

    //查询当日消费总金额
    Float selectTotal(@Param("open_id")String openId,@Param("expense_time")String time);
}