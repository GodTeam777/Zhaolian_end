package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.data.entity.ProorderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProorderMapper {

    //查询理财产品
    List<Proorder> pro_order_all(String start, String end);

    //查询理财产品一天的总数
    int pro_order_day_count(String dates, String datesOne);

    //查询理财产品一月的总数
    int pro_order_month_count(Integer month);

    long countByExample(ProorderExample example);

    int deleteByExample(ProorderExample example);

    int deleteByPrimaryKey(BigDecimal poid);

    int insert(Proorder record);

    int insertSelective(Proorder record);

    List<Proorder> selectByExample(ProorderExample example);

    Proorder selectByPrimaryKey(BigDecimal poid);

    int updateByExampleSelective(@Param("record") Proorder record, @Param("example") ProorderExample example);

    int updateByExample(@Param("record") Proorder record, @Param("example") ProorderExample example);

    int updateByPrimaryKeySelective(Proorder record);

    int updateByPrimaryKey(Proorder record);
}