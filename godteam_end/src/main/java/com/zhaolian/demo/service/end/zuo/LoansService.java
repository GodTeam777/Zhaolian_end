package com.zhaolian.demo.service.end.zuo;

import com.zhaolian.demo.data.entity.Bighuankuan;

import java.util.List;

public interface LoansService {

    //大额贷款还款总数
    List<Bighuankuan> huankuan_chart();
}
