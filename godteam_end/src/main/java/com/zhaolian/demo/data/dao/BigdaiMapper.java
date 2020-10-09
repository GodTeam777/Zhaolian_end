package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.BigdaiExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.web.util.BigdaiDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BigdaiMapper {

    public int getBigdaiCount(BigdaiDTO dto);

    public List<Bigdai> selectBigdaiByPage(Map<String, Object> param);

    long countByExample(BigdaiExample example);

    int deleteByExample(BigdaiExample example);

    int deleteByPrimaryKey(int bdid);

    int insert(Bigdai record);

    int insertSelective(Bigdai record);

    List<Bigdai> selectByExample(BigdaiExample example);

    Bigdai selectByPrimaryKey(BigDecimal bdid);

    int updateByExampleSelective(@Param("record") Bigdai record, @Param("example") BigdaiExample example);

    int updateByExample(@Param("record") Bigdai record, @Param("example") BigdaiExample example);

    int updateByPrimaryKeySelective(Bigdai record);

    int updateByPrimaryKey(Bigdai record);
}