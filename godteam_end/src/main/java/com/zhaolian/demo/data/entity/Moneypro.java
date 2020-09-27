package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Moneypro implements Serializable {
    private BigDecimal mpid;

    private String mpname;

    private String mptype;

    private BigDecimal income;

    private String mppath;

    private String mpTitle;

    private String mpBody;

    private BigDecimal zhouqi;

    private BigDecimal minMoney;

    private BigDecimal bigMoney;

    private static final long serialVersionUID = 1L;

    public BigDecimal getMpid() {
        return mpid;
    }

    public void setMpid(BigDecimal mpid) {
        this.mpid = mpid;
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

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getMppath() {
        return mppath;
    }

    public void setMppath(String mppath) {
        this.mppath = mppath;
    }

    public String getMpTitle() {
        return mpTitle;
    }

    public void setMpTitle(String mpTitle) {
        this.mpTitle = mpTitle;
    }

    public String getMpBody() {
        return mpBody;
    }

    public void setMpBody(String mpBody) {
        this.mpBody = mpBody;
    }

    public BigDecimal getZhouqi() {
        return zhouqi;
    }

    public void setZhouqi(BigDecimal zhouqi) {
        this.zhouqi = zhouqi;
    }

    public BigDecimal getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(BigDecimal minMoney) {
        this.minMoney = minMoney;
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
        sb.append(", mpid=").append(mpid);
        sb.append(", mpname=").append(mpname);
        sb.append(", mptype=").append(mptype);
        sb.append(", income=").append(income);
        sb.append(", mppath=").append(mppath);
        sb.append(", mpTitle=").append(mpTitle);
        sb.append(", mpBody=").append(mpBody);
        sb.append(", zhouqi=").append(zhouqi);
        sb.append(", minMoney=").append(minMoney);
        sb.append(", bigMoney=").append(bigMoney);
        sb.append("]");
        return sb.toString();
    }
}