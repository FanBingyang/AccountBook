package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.YearlyBill;
import pojo.YearlyBillExample;

public interface YearlyBillMapper {
    int countByExample(YearlyBillExample example);

    int deleteByExample(YearlyBillExample example);

    int deleteByPrimaryKey(Integer yearlyId);

    int insert(YearlyBill record);

    int insertSelective(YearlyBill record);

    List<YearlyBill> selectByExample(YearlyBillExample example);

    YearlyBill selectByPrimaryKey(Integer yearlyId);

    int updateByExampleSelective(@Param("record") YearlyBill record, @Param("example") YearlyBillExample example);

    int updateByExample(@Param("record") YearlyBill record, @Param("example") YearlyBillExample example);

    int updateByPrimaryKeySelective(YearlyBill record);

    int updateByPrimaryKey(YearlyBill record);
}