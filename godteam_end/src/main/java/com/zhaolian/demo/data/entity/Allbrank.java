package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Allbrank implements Serializable {
    private BigDecimal bid;

    private String bname;

    private String bpath;

    private static final long serialVersionUID = 1L;

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBpath() {
        return bpath;
    }

    public void setBpath(String bpath) {
        this.bpath = bpath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bid=").append(bid);
        sb.append(", bname=").append(bname);
        sb.append(", bpath=").append(bpath);
        sb.append("]");
        return sb.toString();
    }
}