package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.SmadaiLilv;
import com.zhaolian.demo.data.entity.SmadaiLilvExample;

import java.math.BigDecimal;
import java.util.List;

import com.zhaolian.demo.data.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmadaiLilvMapper {
    //按编号修改
    int updateByidlilv(SmadaiLilv smadaiLilv);
    //按编号查询
    public SmadaiLilv  selectByid(BigDecimal id);


    long countByExample(SmadaiLilvExample example);

    int deleteByExample(SmadaiLilvExample example);

    int insert(SmadaiLilv record);

    int insertSelective(SmadaiLilv record);

    List<SmadaiLilv> selectByExample(SmadaiLilvExample example);

    int updateByExampleSelective(@Param("record") SmadaiLilv record, @Param("example") SmadaiLilvExample example);

    int updateByExample(@Param("record") SmadaiLilv record, @Param("example") SmadaiLilvExample example);
}