package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Allbrank implements Serializable {
    private BigDecimal bid;

    private BigDecimal bname;

    private BigDecimal bpath;

    private static final long serialVersionUID = 1L;

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public BigDecimal getBname() {
        return bname;
    }

    public void setBname(BigDecimal bname) {
        this.bname = bname;
    }

    public BigDecimal getBpath() {
        return bpath;
    }

    public void setBpath(BigDecimal bpath) {
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