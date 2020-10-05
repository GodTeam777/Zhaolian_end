package com.zhaolian.demo.service.end.zuo;

import com.zhaolian.demo.data.dao.BighuankuanMapper;
import com.zhaolian.demo.data.entity.Bighuankuan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("LoansService")
public class LoansServiceImpl implements LoansService {

    @Resource
    BighuankuanMapper bighuankuanMapper;

    @Override
    public List<Bighuankuan> huankuan_chart() {
        return bighuankuanMapper.huankuangChart();
    }
}
