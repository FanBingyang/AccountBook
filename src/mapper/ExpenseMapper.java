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

    //��ҳ��ѯ
    List<Expense> selectExpenseByLimit(PageInfo pageInfo);

    //��ѯ��ĳ����������������û�open_id
    List<String> selectOpenIdList(String month);

    //�����û�open_idͳ�Ƴ����û�����������������Ļ���
    List<Expense> selectAllByOpenId(Map map);
//    List<Expense> selectAllByOpenId(@Param("open_id")String open_id,@Param("expense_time")String month);

    //��ѯ���������ܽ��
    Float selectTotal(@Param("open_id")String openId,@Param("expense_time")String time);
}