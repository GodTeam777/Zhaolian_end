package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.data.entity.ProorderExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;



import com.zhaolian.demo.web.util.ProoderDTO;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProorderMapper {


    List<Proorder> UserselectByPage(Map<String,Object> map);
    int UsergetTotalCount(BigDecimal id);

    public int getProorderCount(ProoderDTO dto);

    public List<Proorder> selectProorderByPage(Map<String, Object> param);
    //查询理财产品
    List<Proorder> pro_order_all(String start, String end);

    //查询理财产品一天的总数
    int pro_order_day_count(String dates, String datesOne);

    //查询理财产品一月的总数
    int pro_order_month_count(Integer month);

    //查询单个理财产品一天的总数String dates, String datesOne,BigDecimal mpid
    BigDecimal getsumbyid(Map mpas);

    //理财产品总数
    int getProCount();

    long countByExample(ProorderExample example);

    int deleteByExample(ProorderExample example);

    int deleteByPrimaryKey(BigDecimal poid);

    int insert(Proorder record);

    int insertSelective(Proorder record);

    List<Proorder> selectByExample(ProorderExample example);

    Proorder selectByPrimaryKey(BigDecimal poid);

    int updateByExampleSelective(@Param("record") Proorder record, @Param("example") ProorderExample example);

    int updateByExample(@Param("record") Proorder record, @Param("example") ProorderExample example);

    int updateByPrimaryKeySelective(Proorder record);

    int updateByPrimaryKey(Proorder record);
}