package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Home;
import com.zhaolian.demo.data.entity.HomeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HomeMapper {
    long countByExample(HomeExample example);

    int deleteByExample(HomeExample example);

    int deleteByPrimaryKey(BigDecimal hid);

    int insert(Home record);

    int insertSelective(Home record);

    List<Home> selectByExample(HomeExample example);

    Home selectByPrimaryKey(BigDecimal hid);

    int updateByExampleSelective(@Param("record") Home record, @Param("example") HomeExample example);

    int updateByExample(@Param("record") Home record, @Param("example") HomeExample example);

    int updateByPrimaryKeySelective(Home record);

    int updateByPrimaryKey(Home record);
}