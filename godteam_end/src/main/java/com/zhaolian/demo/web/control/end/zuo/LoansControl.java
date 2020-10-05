package com.zhaolian.demo.web.control.end.zuo;

import com.zhaolian.demo.data.entity.Bighuankuan;
import com.zhaolian.demo.service.end.zuo.LoansService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class LoansControl {

    @Resource
    LoansService loansService;

    public int getDaysOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    @RequestMapping(value = "huankuan_chart", method = RequestMethod.POST)
    public @ResponseBody List<Bighuankuan> HuanKuanChart(){
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
//        for (int j=0;j<yearArray.length;j++){
//            System.out.println("---------"+yearArray[j]+"年----------");
//            for(int i = 1; i < 13; i++){
//                int day = getDaysOfMonth(sdf.parse(yearArray[j]+"-"+i));
//                System.out.println(yearArray[j]+"年"+i+"月："+day+"天数");
//            }
//        }
        List<Bighuankuan> all_huankuan = loansService.huankuan_chart();
        for (Bighuankuan huankuan : all_huankuan) {
            for (int j = 0; j < all_huankuan.size(); j++) {
                System.err.println(huankuan.getHuanDate());
            }
        }
        return all_huankuan;
    }
}
