package com.zhaolian.demo.service.end.zuo;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface BigService {

    //按天查询，大额贷款
    List<Map<String, Object>> Big_DaiKuan_day_Chart(String chart_date) throws ParseException;

    //按天查询，大额还款
    List<Map<String, Object>> Big_HuanKuan_day_Chart(String chart_date) throws ParseException;

    //按月查询，大额贷款
    List<Map<String, Object>> Big_DaiKuan_month_Chart(String chart_date) throws ParseException;

    //按月查询，大额还款
    List<Map<String, Object>> Big_HuanKuan_month_Chart(String chart_date) throws ParseException;

    //查询大额贷款
    int BigDaiKuanCount();
}
