package com.zhaolian.demo;

import com.zhaolian.demo.data.dao.SamlldaiOrderMapper;
import com.zhaolian.demo.data.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    SamlldaiOrderMapper samlldaiOrderMapper;


    public String getCurrYearLast(Integer month, Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(month ,year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date time = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(time);
    }

    public String getCurrYearFirst(Integer month, Integer year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(month ,year);
        Date time = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(time);
    }


    @Test
    void chart() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String chart_date = "2020-01";
        //获取天数
        Integer format_year = Integer.valueOf(chart_date.substring(0, 4));
        Integer format_month = Integer.valueOf(chart_date.substring(5, 7));
        String yearFirst = getCurrYearFirst(format_month, format_year);
        String yearLast = getCurrYearLast(format_month, format_year);

        System.err.println("前端传递的日期："+chart_date+"，"+format_year+"年第一天："+yearFirst+",最后一天："+yearLast);
        List<SamlldaiOrder> samll_all = samlldaiOrderMapper.samll_dk_all(yearFirst, yearLast);
        int M=0;
        List<Map> list=new ArrayList<>();
        Map data=null;
        Boolean flag=true;

        List<String> listNew = new ArrayList<String>();
        //去重
        for (SamlldaiOrder samlldaiOrder : samll_all) {
            if (!listNew.contains(sdf.format(samlldaiOrder.getDaiDate()))) {
                listNew.add(sdf.format(samlldaiOrder.getDaiDate()));
            }
        }
        System.err.println("去重结果："+listNew.toString());

        for (int j = 1; j <= 12; j++){
            for (String set : listNew) {
                M = Integer.valueOf(set.substring(5,7));
                if (j == Integer.valueOf(M)) {
                    data=new HashMap();
                    data.put("samll_date",j);
                    int count = samlldaiOrderMapper.samll_month_count(M);
                    data.put("samll_count",count);
                    list.add(data);
                    flag=false;
                }
            }
            if(flag){
                data=new HashMap();
                data.put("samll_date",j);
                data.put("samll_count"," ");
                list.add(data);
            }else {
                flag=true;
            }
        }
        for (Map map1 : list) {
            System.err.println(map1.toString());
        }
    }

}
