package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Education;
import com.zhaolian.demo.data.entity.EducationExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EducationMapper {

    //查询记录总数
    public int getTotalCount();
    //学历分页
    public List<Education> selectByPage(Map<String, Object> param);

    long countByExample(EducationExample example);

    int deleteByExample(EducationExample example);

    int deleteByPrimaryKey(BigDecimal edusersid);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(BigDecimal edusersid);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}