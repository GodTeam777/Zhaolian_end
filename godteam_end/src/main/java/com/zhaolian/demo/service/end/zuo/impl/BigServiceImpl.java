package com.zhaolian.demo.service.end.zuo.impl;

import com.zhaolian.demo.data.dao.BigdaiorderMapper;
import com.zhaolian.demo.data.dao.BighuankuanMapper;
import com.zhaolian.demo.data.entity.Bigdaiorder;
import com.zhaolian.demo.data.entity.Bighuankuan;
import com.zhaolian.demo.service.end.zuo.BigService;
import com.zhaolian.demo.web.util.Chart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("BigDaiOrderService")
public class BigServiceImpl implements BigService {

    @Resource
    BigdaiorderMapper bigdaiorderMapper;

    @Resource
    BighuankuanMapper bighuankuanMapper;

    Chart chart = new Chart();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
    String last = "";
    String month_date = "";
    Integer format_year = 0;
    Integer format_month = 0;

    @Override
    public List<Map<String, Object>> Big_DaiKuan_day_Chart(String chart_date) throws ParseException {
        last = chart.getLastDayOfMonth(chart_date);
        month_date = String.valueOf(last);
        //获取天数
        Integer.valueOf(chart_date.substring(0, 4));
        Integer.valueOf(chart_date.substring(5, 7));
        int day = chart.getDaysOfMonth(format.parse(format_year+"-"+format_month));
        List<Bigdaiorder> samll_all = bigdaiorderMapper.big_dk_all(chart_date+"-01", month_date);
        int y = 0;
        int M = 0;
        String d = "";
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data=null;
        Boolean flag=true;
        List<String> listNew = new ArrayList<String>();
        //去重
        for (Bigdaiorder bigdaiorder : samll_all) {
            if (!listNew.contains(sdf.format(bigdaiorder.getDaiDate()))) {
                listNew.add(sdf.format(bigdaiorder.getDaiDate()));
            }
        }
        for (int j=1;j<=day;j++){
            for (String set : listNew) {
                d = set.substring(8,10);
                y = Integer.valueOf(set.substring(0,4));
                M = Integer.valueOf(set.substring(5,7));
                if(j==Integer.parseInt(d)){
                    Bigdaiorder big=new Bigdaiorder();
                    big.setDaiDate(sdf.parse(y+"-"+M+"-"+d));
                    data=new HashMap();
                    data.put("big_order_date",big.getDaiDate());
                    int count = bigdaiorderMapper.big_dk_count(set+" 00:00:00",set+" 23:59:59");
                    data.put("big_order_count",count);
                    list.add(data);
                    flag=false;
                }
            }
            if(flag){
                Bigdaiorder big=new Bigdaiorder();
                if(j<10){
                    d=0+""+j;
                }else{
                    d=""+j;
                }
                big.setDaiDate(sdf.parse(y+"-"+M+"-"+d));
                data=new HashMap();
                data.put("big_order_date",big.getDaiDate());
                data.put("big_order_count"," ");
                list.add(data);
            }else {
                flag=true;
            }
        }
        for (Map map1 : list) {
            System.err.println(map1.toString());
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Big_HuanKuan_day_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String last = chart.getLastDayOfMonth(chart_date);
        String month_date = String.valueOf(last);
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        int day = chart.getDaysOfMonth(format.parse(format_year+"-"+format_month));
        List<Bighuankuan> samll_all = bighuankuanMapper.big_hk_all(chart_date+"-01", month_date);
        int y = 0;
        int M = 0;
        String d = "";
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data=null;
        Boolean flag=true;
        List<String> listNew = new ArrayList<String>();
        //去重
        for (Bighuankuan bighuankuan : samll_all) {
            if (!listNew.contains(sdf.format(bighuankuan.getHuanDate()))) {
                listNew.add(sdf.format(bighuankuan.getHuanDate()));
            }
        }
        for (int j=1;j<=day;j++){
            for (String set : listNew) {
                d = set.substring(8,10);
                y = Integer.valueOf(set.substring(0,4));
                M = Integer.valueOf(set.substring(5,7));
                if(j==Integer.parseInt(d)){
                    Bighuankuan big=new Bighuankuan();
                    big.setHuanDate(sdf.parse(y+"-"+M+"-"+d));
                    data=new HashMap();
                    data.put("big_huan_date",big.getHuanDate());
                    int count = bighuankuanMapper.big_hk_count(set+" 00:00:00",set+" 23:59:59");
                    data.put("big_huan_count",count);
                    list.add(data);
                    flag=false;
                }
            }
            if(flag){
                Bighuankuan big=new Bighuankuan();
                if(j<10){
                    d=0+""+j;
                }else{
                    d=""+j;
                }
                big.setHuanDate(sdf.parse(y+"-"+M+"-"+d));
                data=new HashMap();
                data.put("big_huan_date",big.getHuanDate());
                data.put("big_huan_count"," ");
                list.add(data);
            }else {
                flag=true;
            }
        }
        for (Map map1 : list) {
            System.err.println(map1.toString());
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Big_DaiKuan_month_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        String yearFirst = chart.getCurrYearFirst(format_month, format_year);
        String yearLast = chart.getCurrYearLast(format_month, format_year);
        List<Bigdaiorder> big_all = bigdaiorderMapper.big_dk_all(yearFirst, yearLast);
        int M = 0;
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data = null;
        Boolean flag = true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (Bigdaiorder bigdaiorder : big_all) {
            if (!listNew.contains(sdf.format(bigdaiorder.getDaiDate()))) {
                listNew.add(sdf.format(bigdaiorder.getDaiDate()));
            }
        }
        for (int j = 1; j <= 12; j++) {
            for (String set : listNew) {
                M = Integer.valueOf(set.substring(5, 7));
                if (j == Integer.valueOf(M)) {
                    data = new HashMap();
                    data.put("big_month_date", j);
                    int count = bigdaiorderMapper.big_month_count(M);
                    data.put("big_month_count", count);
                    list.add(data);
                    flag = false;
                }
            }
            if (flag) {
                data = new HashMap();
                data.put("big_month_date", j);
                data.put("big_month_count", " ");
                list.add(data);
            } else {
                flag = true;
            }
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Big_HuanKuan_month_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        String yearFirst = chart.getCurrYearFirst(format_month, format_year);
        String yearLast = chart.getCurrYearLast(format_month, format_year);

        System.err.println("前端传递的日期：" + chart_date + "，" + format_year + "年第一天：" + yearFirst + ",最后一天：" + yearLast);
        List<Bighuankuan> big_all = bighuankuanMapper.big_hk_all(yearFirst, yearLast);
        int M = 0;
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data = null;
        Boolean flag = true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (Bighuankuan bighuankuan : big_all) {
            if (!listNew.contains(sdf.format(bighuankuan.getHuanDate()))) {
                listNew.add(sdf.format(bighuankuan.getHuanDate()));
            }
        }
        for (int k = 1; k <= 12; k++) {
            for (String set : listNew) {
                M = Integer.valueOf(set.substring(5, 7));
                if (k == Integer.valueOf(M)) {
                    data = new HashMap();
                    data.put("big_month_date", k);
                    int count = bighuankuanMapper.big_month_count(M);
                    data.put("big_month_count", count);
                    list.add(data);
                    flag = false;
                }
            }
            if (flag) {
                data = new HashMap();
                data.put("big_month_date", k);
                data.put("big_month_count", " ");
                list.add(data);
            } else {
                flag = true;
            }
        }
        return list;
    }

    @Override
    public int BigDaiKuanCount() {
        return bigdaiorderMapper.getBigDaiCount();
    }
}
