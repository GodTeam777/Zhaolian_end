package com.zhaolian.demo.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Chart {

    //根据年 - 月查询天数
    public int getDaysOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }


    //获取月份的最后一天
    public String getLastDayOfMonth(String yearMonth) {
        Integer year = Integer.parseInt(yearMonth.split("-")[0]);//年
        Integer month = Integer.parseInt(yearMonth.split("-")[1]);//月
        Calendar cale = Calendar.getInstance();
        //设置年份
        cale.set(Calendar.YEAR, year);
        //设置当前月的上一个月
        cale.set(Calendar.MONTH, month);
        //获取月份中的第一天
        Integer lastDay = cale.getMinimum(Calendar.DATE);
        //上个月的第一天减去1就是当月的最后一天
        cale.set(Calendar.DAY_OF_MONTH, lastDay - 1);
        //格式化日期
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取月份最后一天
        String last = format.format(cale.getTime());
        return last;
    }

    //获取年的第一天
    public String getCurrYearFirst(Integer month, Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(month ,year);
        Date time = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(time);
    }

    //获取年的最后一天
    public String getCurrYearLast(Integer month, Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(month ,year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date time = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(time);
    }
}
