package com.zhaolian.demo.data.dao;

import com.zhaolian.demo.data.entity.Bigdai;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.BigdaiorderExample;
import java.math.BigDecimal;
import java.util.List;
<<<<<<< HEAD
import java.util.Map;

import com.zhaolian.demo.web.util.BigdaiDTO;
import com.zhaolian.demo.web.util.BigdaiordeDTO;
=======

import com.zhaolian.demo.data.entity.SamlldaiOrder;
>>>>>>> 02566c226c928678cd03245929b015cb862339fd
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BigdaiorderMapper {

<<<<<<< HEAD
    public int getBigdaiorderCount(BigdaiordeDTO dto);

    public List<Bigdaiorder> selectBigdaiorderByPage(Map<String, Object> param);

    List<Bigdaiorder> selectall();
=======
    //查询大额贷款
    List<Bigdaiorder> big_dk_all(String start, String end);

    //查询大额贷款一天的总数
    int big_dk_count(String dates, String datesOne);

    //查询大额贷款一月的总数
    int big_month_count(Integer month);
>>>>>>> 02566c226c928678cd03245929b015cb862339fd

    long countByExample(BigdaiorderExample example);

    int deleteByExample(BigdaiorderExample example);

    int deleteByPrimaryKey(BigDecimal boid);

    int insert(Bigdaiorder record);

    int insertSelective(Bigdaiorder record);

    List<Bigdaiorder> selectByExample(BigdaiorderExample example);

    Bigdaiorder selectByPrimaryKey(BigDecimal boid);

    int updateByExampleSelective(@Param("record") Bigdaiorder record, @Param("example") BigdaiorderExample example);

    int updateByExample(@Param("record") Bigdaiorder record, @Param("example") BigdaiorderExample example);

    int updateByPrimaryKeySelective(Bigdaiorder record);

    int updateByPrimaryKey(Bigdaiorder record);
}