package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Smallhuankuan;
import com.zhaolian.demo.data.entity.SmallhuankuanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmallhuankuanMapper {
    long countByExample(SmallhuankuanExample example);

    int deleteByExample(SmallhuankuanExample example);

    int deleteByPrimaryKey(BigDecimal hid);

    int insert(Smallhuankuan record);

    int insertSelective(Smallhuankuan record);

    List<Smallhuankuan> selectByExample(SmallhuankuanExample example);

    Smallhuankuan selectByPrimaryKey(BigDecimal hid);

    int updateByExampleSelective(@Param("record") Smallhuankuan record, @Param("example") SmallhuankuanExample example);

    int updateByExample(@Param("record") Smallhuankuan record, @Param("example") SmallhuankuanExample example);

    int updateByPrimaryKeySelective(Smallhuankuan record);

    int updateByPrimaryKey(Smallhuankuan record);
}