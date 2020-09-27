package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.NewsComment;
import com.zhaolian.demo.data.entity.NewsCommentExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NewsCommentMapper {
    long countByExample(NewsCommentExample example);

    int deleteByExample(NewsCommentExample example);

    int deleteByPrimaryKey(BigDecimal ncid);

    int insert(NewsComment record);

    int insertSelective(NewsComment record);

    List<NewsComment> selectByExample(NewsCommentExample example);

    NewsComment selectByPrimaryKey(BigDecimal ncid);

    int updateByExampleSelective(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    int updateByExample(@Param("record") NewsComment record, @Param("example") NewsCommentExample example);

    int updateByPrimaryKeySelective(NewsComment record);

    int updateByPrimaryKey(NewsComment record);
}