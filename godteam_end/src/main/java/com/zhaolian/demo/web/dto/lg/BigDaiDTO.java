package com.zhaolian.demo.web.dto.lg;

import java.math.BigDecimal;

public class BigDaiDTO {
    String seach_type;
    BigDecimal seach_date;
    BigDecimal seach_lilv1;
    BigDecimal seach_lilv2;
    BigDecimal seach_money1;
    BigDecimal seach_money2;

    public BigDaiDTO() {
    }

    @Override
    public String toString() {
        return "BigDaiDTO{" +
                "seach_type='" + seach_type + '\'' +
                ", seach_date=" + seach_date +
                ", seach_lilv1=" + seach_lilv1 +
                ", seach_lilv2=" + seach_lilv2 +
                ", seach_money1=" + seach_money1 +
                ", seach_money2=" + seach_money2 +
                '}';
    }

    public String getSeach_type() {
        return seach_type;
    }

    public void setSeach_type(String seach_type) {
        this.seach_type = seach_type;
    }

    public BigDecimal getSeach_date() {
        return seach_date;
    }

    public void setSeach_date(BigDecimal seach_date) {
        this.seach_date = seach_date;
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

    public BigDecimal getSeach_money1() {
        return seach_money1;
    }

    public void setSeach_money1(BigDecimal seach_money1) {
        this.seach_money1 = seach_money1;
    }

    public BigDecimal getSeach_money2() {
        return seach_money2;
    }

    public void setSeach_money2(BigDecimal seach_money2) {
        this.seach_money2 = seach_money2;
    }
}
