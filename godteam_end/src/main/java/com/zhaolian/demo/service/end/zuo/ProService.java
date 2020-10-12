package com.zhaolian.demo.service.end.zuo;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface ProService {

    //按天查询，理财产品
    List<Map<String, Object>> Pro_day_Chart(String chart_date) throws ParseException;

    //按月查询，理财产品
    List<Map<String, Object>> Pro_month_Chart(String chart_date) throws ParseException;
}
