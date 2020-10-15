package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.BigdaiVlidate;
import com.zhaolian.demo.data.entity.BigdaiVlidateExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BigdaiVlidateMapper {
    long countByExample(BigdaiVlidateExample example);

    int deleteByExample(BigdaiVlidateExample example);

    int deleteByPrimaryKey(BigDecimal vid);

    int insert(BigdaiVlidate record);

    int insertSelective(BigdaiVlidate record);

    List<BigdaiVlidate> selectByExample(BigdaiVlidateExample example);

    BigdaiVlidate selectByPrimaryKey(BigDecimal vid);

    int updateByExampleSelective(@Param("record") BigdaiVlidate record, @Param("example") BigdaiVlidateExample example);

    int updateByExample(@Param("record") BigdaiVlidate record, @Param("example") BigdaiVlidateExample example);

    int updateByPrimaryKeySelective(BigdaiVlidate record);

    int updateByPrimaryKey(BigdaiVlidate record);
    List<BigdaiVlidate> selectall();
 }