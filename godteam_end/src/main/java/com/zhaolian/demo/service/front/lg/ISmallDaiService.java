package com.zhaolian.demo.service.front.lg;

import com.zhaolian.demo.data.entity.SamlldaiOrder;
import com.zhaolian.demo.data.entity.Users;

import java.util.List;
import java.util.Map;

public interface ISmallDaiService {
    public Map smallDai_home(Users users);

    public List<Object> smalldai_brank(Users users);

    public boolean smalldai(Users users, SamlldaiOrder so);
}
