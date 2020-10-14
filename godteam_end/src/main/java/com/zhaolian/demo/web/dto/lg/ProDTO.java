package com.zhaolian.demo.web.dto.lg;

import java.math.BigDecimal;

public class ProDTO {
    String seach_mptype;
    BigDecimal seach_lilv1;
    BigDecimal seach_lilv2;
    BigDecimal seach_money;
    BigDecimal seach_zhouqi;

    public ProDTO() {
    }

    public ProDTO(String seach_mptype, BigDecimal seach_lilv1, BigDecimal seach_lilv2, BigDecimal seach_money, BigDecimal seach_zhouqi) {
        this.seach_mptype = seach_mptype;
        this.seach_lilv1 = seach_lilv1;
        this.seach_lilv2 = seach_lilv2;
        this.seach_money = seach_money;
        this.seach_zhouqi = seach_zhouqi;
    }

    public String getSeach_mptype() {
        return seach_mptype;
    }

    public void setSeach_mptype(String seach_mptype) {
        this.seach_mptype = seach_mptype;
    }

    public BigDecimal getSeach_lilv1() {
        return seach_lilv1;
    }

    public void setSeach_lilv1(BigDecimal seach_lilv1) {
        this.seach_lilv1 = seach_lilv1;
    }

    public BigDecimal getSeach_lilv2() {
        return seach_lilv2;
    }

    public void setSeach_lilv2(BigDecimal seach_lilv2) {
        this.seach_lilv2 = seach_lilv2;
    }

    public BigDecimal getSeach_money() {
        return seach_money;
    }

    public void setSeach_money(BigDecimal seach_money) {
        this.seach_money = seach_money;
    }

    public BigDecimal getSeach_zhouqi() {
        return seach_zhouqi;
    }

    public void setSeach_zhouqi(BigDecimal seach_zhouqi) {
        this.seach_zhouqi = seach_zhouqi;
    }

    @Override
    public String toString() {
        return "ProDTO{" +
                "seach_mptype='" + seach_mptype + '\'' +
                ", seach_lilv1=" + seach_lilv1 +
                ", seach_lilv2=" + seach_lilv2 +
                ", seach_money=" + seach_money +
                ", seach_zhouqi=" + seach_zhouqi +
                '}';
    }
}
