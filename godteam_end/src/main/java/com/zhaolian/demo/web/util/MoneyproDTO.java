package com.zhaolian.demo.web.util;

public class MoneyproDTO {
    String mpname;
    String mptype;

    public MoneyproDTO() {
    }

    public MoneyproDTO(String mpname, String mptype) {
        this.mpname = mpname;
        this.mptype = mptype;
    }

    @Override
    public String toString() {
        return "MoneyproDTO{" +
                "mpname='" + mpname + '\'' +
                ", mptype='" + mptype + '\'' +
                '}';
    }

    public String getMpname() {
        return mpname;
    }

    public void setMpname(String mpname) {
        this.mpname = mpname;
    }

    public String getMptype() {
        return mptype;
    }

    public void setMptype(String mptype) {
        this.mptype = mptype;
    }
}
