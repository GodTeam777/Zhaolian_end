package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Car;
import com.zhaolian.demo.data.entity.CarExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarMapper {
    //查询记录总数
    public int getTotalCount();
    //学历分页
    public List<Car> selectByPage(Map<String, Object> param);

    long countByExample(CarExample example);

    int deleteByExample(CarExample example);

    int deleteByPrimaryKey(BigDecimal cid);

    int insert(Car record);

    int insertSelective(Car record);

    List<Car> selectByExample(CarExample example);

    Car selectByPrimaryKey(BigDecimal cid);

    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}