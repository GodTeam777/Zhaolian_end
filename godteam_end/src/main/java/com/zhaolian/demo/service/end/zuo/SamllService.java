package com.zhaolian.demo.service.end.zuo;

import com.zhaolian.demo.data.entity.SamlldaiOrder;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface SamllService {

    //查询小额贷款
    List<Map<String, Object>> Samll_DaiKuan_Chart(String chart_date) throws ParseException;

    //查询小额还款
    List<Map<String, Object>> Small_HuanKuan_Chart(String chart_date) throws ParseException;

    //按月查询小额贷款
    List<Map<String, Object>> Samll_DaiKuan_month_Chart(String chart_date) throws ParseException;

    //按月查询小额还款
    List<Map<String, Object>> Small_HuanKuan_month_Chart(String chart_date) throws ParseException;
}
