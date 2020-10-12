package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.SamlldaiOrderExample;
import java.math.BigDecimal;
import java.util.List;

import com.zhaolian.demo.data.entity.SmadaiLilv;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SamlldaiOrderMapper {

    //查询小额贷款
    List<SamlldaiOrder> samll_dk_all(String start, String end);

    int samll_dk_count(String dates, String datesOne);

    int samll_month_count(Integer month);

    long countByExample(SamlldaiOrderExample example);

    int deleteByExample(SamlldaiOrderExample example);

    int deleteByPrimaryKey(BigDecimal sdoid);

    int insert(SamlldaiOrder record);

    int insertSelective(SamlldaiOrder record);

    List<SamlldaiOrder> selectByExample(SamlldaiOrderExample example);

    SamlldaiOrder selectByPrimaryKey(BigDecimal sdoid);

    int updateByExampleSelective(@Param("record") SamlldaiOrder record, @Param("example") SamlldaiOrderExample example);

    int updateByExample(@Param("record") SamlldaiOrder record, @Param("example") SamlldaiOrderExample example);

    int updateByPrimaryKeySelective(SamlldaiOrder record);

    int updateByPrimaryKey(SamlldaiOrder record);
}