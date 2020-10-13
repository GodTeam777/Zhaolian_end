package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.BigdaiExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD

import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.web.util.BigdaiDTO;
=======
>>>>>>> 02566c226c928678cd03245929b015cb862339fd
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BigdaiMapper {

    public int getBigdaiCount(BigdaiDTO dto);

    public List<Bigdai> selectBigdaiByPage(Map<String, Object> param);

    long countByExample(BigdaiExample example);

    int deleteByExample(BigdaiExample example);

    int deleteByPrimaryKey(BigDecimal bdid);

    int insert(Bigdai record);

    int insertSelective(Bigdai record);

    List<Bigdai> selectByExample(BigdaiExample example);

    Bigdai selectByPrimaryKey(BigDecimal bdid);

    int updateByExampleSelective(@Param("record") Bigdai record, @Param("example") BigdaiExample example);

    int updateByExample(@Param("record") Bigdai record, @Param("example") BigdaiExample example);

    int updateByPrimaryKeySelective(Bigdai record);

    int updateByPrimaryKey(Bigdai record);

    //分页
    List<Bigdai> lgselectByPage(Map map);
}