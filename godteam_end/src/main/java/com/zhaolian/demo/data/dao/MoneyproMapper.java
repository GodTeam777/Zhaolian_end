package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Moneypro;
import com.zhaolian.demo.data.entity.MoneyproExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoneyproMapper {
    long countByExample(MoneyproExample example);

    int deleteByExample(MoneyproExample example);

    int deleteByPrimaryKey(BigDecimal mpid);

    int insert(Moneypro record);

    int insertSelective(Moneypro record);

    List<Moneypro> selectByExample(MoneyproExample example);

    Moneypro selectByPrimaryKey(BigDecimal mpid);

    int updateByExampleSelective(@Param("record") Moneypro record, @Param("example") MoneyproExample example);

    int updateByExample(@Param("record") Moneypro record, @Param("example") MoneyproExample example);

    int updateByPrimaryKeySelective(Moneypro record);

    int updateByPrimaryKey(Moneypro record);

    //分页+高级查询
    List<Moneypro> lgselectByPage(Map map);
}