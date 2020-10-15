package com.zhaolian.demo.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Bigdai implements Serializable {
    private BigDecimal bdid;

    private BigDecimal vid;

    private String bdname;

    private String bdpath;

    private BigDecimal interest;

    private String bigdaiTitle;

    private String bigdaiBody;

    private String bdtype;

    private BigDecimal bddate;

    private BigDecimal smallMoney;

    private BigDecimal bigMoney;

    private static final long serialVersionUID = 1L;

    public BigDecimal getBdid() {
        return bdid;
    }

    public void setBdid(BigDecimal bdid) {
        this.bdid = bdid;
    }

    public BigDecimal getVid() {
        return vid;
    }

    public void setVid(BigDecimal vid) {
        this.vid = vid;
    }

    public String getBdname() {
        return bdname;
    }

    public void setBdname(String bdname) {
        this.bdname = bdname;
    }

    public String getBdpath() {
        return bdpath;
    }

    public void setBdpath(String bdpath) {
        this.bdpath = bdpath;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public String getBigdaiTitle() {
        return bigdaiTitle;
    }

    public void setBigdaiTitle(String bigdaiTitle) {
        this.bigdaiTitle = bigdaiTitle;
    }

    public String getBigdaiBody() {
        return bigdaiBody;
    }

    public void setBigdaiBody(String bigdaiBody) {
        this.bigdaiBody = bigdaiBody;
    }

    public String getBdtype() {
        return bdtype;
    }

    public void setBdtype(String bdtype) {
        this.bdtype = bdtype;
    }

    public BigDecimal getBddate() {
        return bddate;
    }

    public void setBddate(BigDecimal bddate) {
        this.bddate = bddate;
    }

    public BigDecimal getSmallMoney() {
        return smallMoney;
    }

    public void setSmallMoney(BigDecimal smallMoney) {
        this.smallMoney = smallMoney;
    }

    public BigDecimal getBigMoney() {
        return bigMoney;
    }

    public void setBigMoney(BigDecimal bigMoney) {
        this.bigMoney = bigMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bdid=").append(bdid);
        sb.append(", vid=").append(vid);
        sb.append(", bdname=").append(bdname);
        sb.append(", bdpath=").append(bdpath);
        sb.append(", interest=").append(interest);
        sb.append(", bigdaiTitle=").append(bigdaiTitle);
        sb.append(", bigdaiBody=").append(bigdaiBody);
        sb.append(", bdtype=").append(bdtype);
        sb.append(", bddate=").append(bddate);
        sb.append(", smallMoney=").append(smallMoney);
        sb.append(", bigMoney=").append(bigMoney);
        sb.append("]");
        return sb.toString();
    }
}