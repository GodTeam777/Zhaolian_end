package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.BigdaiorderExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BigdaiorderMapper {
    long countByExample(BigdaiorderExample example);

    int deleteByExample(BigdaiorderExample example);

    int deleteByPrimaryKey(BigDecimal boid);

    int insert(Bigdaiorder record);

    int insertSelective(Bigdaiorder record);

    List<Bigdaiorder> selectByExample(BigdaiorderExample example);

    Bigdaiorder selectByPrimaryKey(BigDecimal boid);

    int updateByExampleSelective(@Param("record") Bigdaiorder record, @Param("example") BigdaiorderExample example);

    int updateByExample(@Param("record") Bigdaiorder record, @Param("example") BigdaiorderExample example);

    int updateByPrimaryKeySelective(Bigdaiorder record);

    int updateByPrimaryKey(Bigdaiorder record);
}