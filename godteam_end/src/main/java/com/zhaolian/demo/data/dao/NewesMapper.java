package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Newes;
import com.zhaolian.demo.data.entity.NewesExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.zhaolian.demo.web.dto.zuo.NewsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewesMapper {

    //自定义接口
    //高级查询+分页
    List<Newes> SelectNewsPage(Map<String,Object> map);

    //查询总数
    int getNewsCount(NewsDTO newsdto);

    //新增新闻
    int insert(Newes record);

    long countByExample(NewesExample example);

    int deleteByExample(NewesExample example);

    int deleteByPrimaryKey(BigDecimal nid);


    int insertSelective(Newes record);
    //新闻全部查询

    List<Newes> selectByAll(NewesExample example);
   //类型1
    List<Newes> selectByExample(NewesExample example);

    //类型2
    List<Newes> selectByExampletype(NewesExample example);

    //类型
    List<Newes> selectBytype(NewesExample example);

    Newes selectByPrimaryKey(BigDecimal nid);

    int updateByExampleSelective(@Param("record") Newes record, @Param("example") NewesExample example);

    int updateByExample(@Param("record") Newes record, @Param("example") NewesExample example);

    int updateByPrimaryKeySelective(Newes record);

    int updateByPrimaryKey(Newes record);
}