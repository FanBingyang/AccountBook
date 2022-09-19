package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.MonthlyBill;
import pojo.MonthlyBillExample;

public interface MonthlyBillMapper {
    int countByExample(MonthlyBillExample example);

    int deleteByExample(MonthlyBillExample example);

    int deleteByPrimaryKey(Integer monthlyId);

    int insert(MonthlyBill record);

    int insertSelective(MonthlyBill record);

    List<MonthlyBill> selectByExample(MonthlyBillExample example);

    MonthlyBill selectByPrimaryKey(Integer monthlyId);

    int updateByExampleSelective(@Param("record") MonthlyBill record, @Param("example") MonthlyBillExample example);

    int updateByExample(@Param("record") MonthlyBill record, @Param("example") MonthlyBillExample example);

    int updateByPrimaryKeySelective(MonthlyBill record);

    int updateByPrimaryKey(MonthlyBill record);

    //ͳ�������·ݣ��������˵�
    List<MonthlyBill> allMonthly(String monthly_time);
}