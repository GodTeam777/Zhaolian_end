package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.Bighuankuan;
import com.zhaolian.demo.data.entity.BighuankuanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BighuankuanMapper {

    //查询大额还款
    List<Bighuankuan> big_hk_all(String start, String end);

    //查询大额还款一天的总数
    int big_hk_count(String dates, String datesOne);

    //查询大额还款一月的总数
    int big_month_count(Integer month);

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