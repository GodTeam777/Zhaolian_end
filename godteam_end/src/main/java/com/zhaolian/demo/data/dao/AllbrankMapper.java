package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Allbrank;
import com.zhaolian.demo.data.entity.AllbrankExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AllbrankMapper {
    long countByExample(AllbrankExample example);

    int deleteByExample(AllbrankExample example);

    int deleteByPrimaryKey(BigDecimal bid);

    int insert(Allbrank record);

    int insertSelective(Allbrank record);

    List<Allbrank> selectByExample(AllbrankExample example);

    Allbrank selectByPrimaryKey(BigDecimal bid);

    int updateByExampleSelective(@Param("record") Allbrank record, @Param("example") AllbrankExample example);

    int updateByExample(@Param("record") Allbrank record, @Param("example") AllbrankExample example);

    int updateByPrimaryKeySelective(Allbrank record);

    int updateByPrimaryKey(Allbrank record);
}