package com.zhaolian.demo.service.end.zuo.impl;

import com.zhaolian.demo.data.dao.SamlldaiOrderMapper;
import com.zhaolian.demo.data.dao.SmallhuankuanMapper;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.Smallhuankuan;
import com.zhaolian.demo.service.end.zuo.SamllService;
import com.zhaolian.demo.web.util.Chart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("SamllService")
public class SamllServiceImpl implements SamllService {

    @Resource
    SamlldaiOrderMapper samlldaiOrderMapper;

    @Resource
    SmallhuankuanMapper smallhuankuanMapper;

    Chart chart = new Chart();

    @Override
    public List<Map<String, Object>> Samll_DaiKuan_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String last = chart.getLastDayOfMonth(chart_date);
        String month_date = String.valueOf(last);
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        int day = chart.getDaysOfMonth(format.parse(format_year+"-"+format_month));

        List<SamlldaiOrder> samll_all = samlldaiOrderMapper.samll_dk_all(chart_date+"-01", month_date);
        int y = 0;
        int M = 0;
        String d = "";
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data=null;
        Boolean flag=true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (SamlldaiOrder samlldaiOrder : samll_all) {
            if (!listNew.contains(sdf.format(samlldaiOrder.getDaiDate()))) {
                listNew.add(sdf.format(samlldaiOrder.getDaiDate()));
            }
        }
        for (int j=1;j<=day;j++){
            for (String set : listNew) {
                d = set.substring(8,10);
                y = Integer.valueOf(set.substring(0,4));
                M = Integer.valueOf(set.substring(5,7));
                if(j==Integer.parseInt(d)){
                    SamlldaiOrder sam=new SamlldaiOrder();
                    sam.setDaiDate(sdf.parse(y+"-"+M+"-"+d));
                    data=new HashMap();
                    data.put("samll_date",sam.getDaiDate());
                    int count = samlldaiOrderMapper.samll_dk_count(set+" 00:00:00",set+" 23:59:59");
                    data.put("samll_count",count);
                    list.add(data);
                    flag=false;
                }
            }
            if(flag){
                SamlldaiOrder sam=new SamlldaiOrder();
                if(j<10){
                    d=0+""+j;
                }else{
                    d=""+j;
                }
                sam.setDaiDate(sdf.parse(y+"-"+M+"-"+d));
                data=new HashMap();
                data.put("samll_date",sam.getDaiDate());
                data.put("samll_count"," ");
                list.add(data);
            }else {
                flag=true;
            }
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Small_HuanKuan_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String last = chart.getLastDayOfMonth(chart_date);
        String month_date = String.valueOf(last);
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        int day = chart.getDaysOfMonth(format.parse(format_year+"-"+format_month));

        List<Smallhuankuan> samll_all = smallhuankuanMapper.samll_hk_all(chart_date+"-01", month_date);
        int y = 0;
        int M = 0;
        String d = "";
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data=null;
        Boolean flag=true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (Smallhuankuan smallhuankuan : samll_all) {
            if (!listNew.contains(sdf.format(smallhuankuan.getHuanDate()))) {
                listNew.add(sdf.format(smallhuankuan.getHuanDate()));
            }
        }
        for (int j=1;j<=day;j++){
            for (String set : listNew) {
                d = set.substring(8,10);
                y = Integer.valueOf(set.substring(0,4));
                M = Integer.valueOf(set.substring(5,7));
                if(j==Integer.parseInt(d)){
                    Smallhuankuan sma=new Smallhuankuan();
                    sma.setHuanDate(sdf.parse(y+"-"+M+"-"+d));
                    data=new HashMap();
                    data.put("small_date",sma.getHuanDate());
                    int count = smallhuankuanMapper.small_hk_count(set+" 00:00:00",set+" 23:59:59");
                    data.put("small_count",count);
                    list.add(data);
                    flag=false;
                }
            }
            if(flag){
                Smallhuankuan sma=new Smallhuankuan();
                if(j<10){
                    d=0+""+j;
                }else{
                    d=""+j;
                }
                sma.setHuanDate(sdf.parse(y+"-"+M+"-"+d));
                data=new HashMap();
                data.put("small_date",sma.getHuanDate());
                data.put("small_count"," ");
                list.add(data);
            }else {
                flag=true;
            }
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Samll_DaiKuan_month_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        String yearFirst = chart.getCurrYearFirst(format_month, format_year);
        String yearLast = chart.getCurrYearLast(format_month, format_year);
        List<SamlldaiOrder> samll_all = samlldaiOrderMapper.samll_dk_all(yearFirst, yearLast);
        int M = 0;
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data = null;
        Boolean flag = true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (SamlldaiOrder samlldaiOrder : samll_all) {
            if (!listNew.contains(sdf.format(samlldaiOrder.getDaiDate()))) {
                listNew.add(sdf.format(samlldaiOrder.getDaiDate()));
            }
        }
        for (int j = 1; j <= 12; j++) {
            for (String set : listNew) {
                M = Integer.valueOf(set.substring(5, 7));
                if (j == Integer.valueOf(M)) {
                    data = new HashMap();
                    data.put("samll_month_date", j);
                    int count = samlldaiOrderMapper.samll_month_count(M);
                    data.put("samll_month_count", count);
                    list.add(data);
                    flag = false;
                }
            }
            if (flag) {
                data = new HashMap();
                data.put("samll_month_date", j);
                data.put("samll_month_count", " ");
                list.add(data);
            } else {
                flag = true;
            }
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Small_HuanKuan_month_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        String yearFirst = chart.getCurrYearFirst(format_month, format_year);
        String yearLast = chart.getCurrYearLast(format_month, format_year);

        System.err.println("前端传递的日期：" + chart_date + "，" + format_year + "年第一天：" + yearFirst + ",最后一天：" + yearLast);
        List<Smallhuankuan> small_all = smallhuankuanMapper.samll_hk_all(yearFirst, yearLast);
        int M = 0;
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data = null;
        Boolean flag = true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (Smallhuankuan smallhuankuan : small_all) {
            if (!listNew.contains(sdf.format(smallhuankuan.getHuanDate()))) {
                listNew.add(sdf.format(smallhuankuan.getHuanDate()));
            }
        }
        for (int j = 1; j <= 12; j++) {
            for (String set : listNew) {
                M = Integer.valueOf(set.substring(5, 7));
                if (j == Integer.valueOf(M)) {
                    data = new HashMap();
                    data.put("small_month_date", j);
                    int count = smallhuankuanMapper.small_month_count(M);
                    data.put("small_month_count", count);
                    list.add(data);
                    flag = false;
                }
            }
            if (flag) {
                data = new HashMap();
                data.put("small_month_date", j);
                data.put("small_month_count", " ");
                list.add(data);
            } else {
                flag = true;
            }
        }
        return list;
    }

    @Override
    public int SmallDaiKuanCount() {
        return samlldaiOrderMapper.getSamllCount();
    }
}
