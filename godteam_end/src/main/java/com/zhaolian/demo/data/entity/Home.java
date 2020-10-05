package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Home implements Serializable {
    private BigDecimal hid;

    private String hname;

    private String haddress;

    private Date hdate;

    private String hpath;

    private BigDecimal status;

    private static final long serialVersionUID = 1L;

    public BigDecimal getHid() {
        return hid;
    }

    public void setHid(BigDecimal hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    public Date getHdate() {
        return hdate;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    public String getHpath() {
        return hpath;
    }

    public void setHpath(String hpath) {
        this.hpath = hpath;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hid=").append(hid);
        sb.append(", hname=").append(hname);
        sb.append(", haddress=").append(haddress);
        sb.append(", hdate=").append(hdate);
        sb.append(", hpath=").append(hpath);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}