package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bighuankuan;
import com.zhaolian.demo.data.entity.BighuankuanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BighuankuanMapper {
    long countByExample(BighuankuanExample example);

    int deleteByExample(BighuankuanExample example);

    int deleteByPrimaryKey(BigDecimal hid);

    int insert(Bighuankuan record);

    int insertSelective(Bighuankuan record);

    List<Bighuankuan> selectByExample(BighuankuanExample example);

    Bighuankuan selectByPrimaryKey(BigDecimal hid);

    int updateByExampleSelective(@Param("record") Bighuankuan record, @Param("example") BighuankuanExample example);

    int updateByExample(@Param("record") Bighuankuan record, @Param("example") BighuankuanExample example);

    int updateByPrimaryKeySelective(Bighuankuan record);

    int updateByPrimaryKey(Bighuankuan record);
}