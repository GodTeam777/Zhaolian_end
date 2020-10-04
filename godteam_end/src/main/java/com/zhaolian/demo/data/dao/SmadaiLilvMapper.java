package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.SmadaiLilv;
import com.zhaolian.demo.data.entity.SmadaiLilvExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SmadaiLilvMapper {
    long countByExample(SmadaiLilvExample example);

    int deleteByExample(SmadaiLilvExample example);

    int insert(SmadaiLilv record);

    int insertSelective(SmadaiLilv record);

    List<SmadaiLilv> selectByExample(SmadaiLilvExample example);

    int updateByExampleSelective(@Param("record") SmadaiLilv record, @Param("example") SmadaiLilvExample example);

    int updateByExample(@Param("record") SmadaiLilv record, @Param("example") SmadaiLilvExample example);
}