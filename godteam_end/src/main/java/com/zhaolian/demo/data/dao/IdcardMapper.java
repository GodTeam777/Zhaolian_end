package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Idcard;
import com.zhaolian.demo.data.entity.IdcardExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IdcardMapper {
    long countByExample(IdcardExample example);

    int deleteByExample(IdcardExample example);

    int deleteByPrimaryKey(BigDecimal cardid);

    int insert(Idcard record);

    int insertSelective(Idcard record);

    List<Idcard> selectByExample(IdcardExample example);

    Idcard selectByPrimaryKey(BigDecimal cardid);

    int updateByExampleSelective(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByExample(@Param("record") Idcard record, @Param("example") IdcardExample example);

    int updateByPrimaryKeySelective(Idcard record);

    int updateByPrimaryKey(Idcard record);
}