package com.zhaolian.demo.service.end.zuo.impl;

import com.zhaolian.demo.data.dao.ProorderMapper;
import com.zhaolian.demo.data.entity.Proorder;
import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.service.end.zuo.ProService;
import com.zhaolian.demo.web.util.Chart;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProServiceImpl implements ProService {

    @Resource
    ProorderMapper proorderMapper;

    Chart chart = new Chart();

    @Override
    public List<Map<String, Object>> Pro_day_Chart(String chart_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String last = chart.getLastDayOfMonth(chart_date);
        String month_date = String.valueOf(last);
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        int day = chart.getDaysOfMonth(format.parse(format_year+"-"+format_month));

        List<Proorder> pro_all = proorderMapper.pro_order_all(chart_date+"-01", month_date);
        //int y = 0;
        int M = 0;
        String d = "";
        List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
        Map data=null;
        Boolean flag=true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (Proorder proorder : pro_all) {
            if (!listNew.contains(sdf.format(proorder.getLicaiDate()))) {
                listNew.add(sdf.format(proorder.getLicaiDate()));
            }
        }
        for (int j = 1;j <= day; j++){
            for (String set : listNew) {
                d = set.substring(8,10);
                //y = Integer.valueOf(set.substring(0, 4));
                //M = Integer.valueOf(set.substring(5, 7));
                if(j == Integer.parseInt(d)){
                    //Proorder pro = new Proorder();
                    //pro.setLicaiDate(sdf.parse(y+"-"+M+"-"+d));
                    data=new HashMap();
                    //data.put("pro_date",pro.getLicaiDate());
                    int count = proorderMapper.pro_order_day_count(set+" 00:00:00",set+" 23:59:59");
                    data.put("pro_count",count);
                    list.add(data);
                    flag=false;
                }
            }
            if(flag){
                //Proorder pro = new Proorder();
                if(j<10){
                    d=0+""+j;
                }else{
                    d=""+j;
                }
                //pro.setLicaiDate(sdf.parse(y+"-"+M+"-"+d));
                data=new HashMap();
                //data.put("pro_date",pro.getLicaiDate());
                data.put("pro_count"," ");
                list.add(data);
            }else {
                flag=true;
            }
        }
        return list;
    }

    @Override
    public List<Map<String, Object>> Pro_month_Chart(String chart_date) throws ParseException {
        return null;
    }
}
