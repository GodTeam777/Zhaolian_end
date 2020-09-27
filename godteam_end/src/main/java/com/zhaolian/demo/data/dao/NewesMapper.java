package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.data.entity.NewesExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewesMapper {
    long countByExample(NewesExample example);

    int deleteByExample(NewesExample example);

    int deleteByPrimaryKey(BigDecimal nid);

    int insert(Newes record);

    int insertSelective(Newes record);

    List<Newes> selectByExample(NewesExample example);

    Newes selectByPrimaryKey(BigDecimal nid);

    int updateByExampleSelective(@Param("record") Newes record, @Param("example") NewesExample example);

    int updateByExample(@Param("record") Newes record, @Param("example") NewesExample example);

    int updateByPrimaryKeySelective(Newes record);

    int updateByPrimaryKey(Newes record);
}