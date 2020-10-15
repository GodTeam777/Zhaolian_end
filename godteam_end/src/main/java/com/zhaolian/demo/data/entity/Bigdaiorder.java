package com.zhaolian.demo.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Bigdaiorder implements Serializable {
    private BigDecimal boid;

    private BigDecimal usersid;

    private BigDecimal bdid;

    private BigDecimal bigmoney;

    private BigDecimal bigdaiDate;

    private BigDecimal yihuan;

    private BigDecimal huanCard;

    private BigDecimal shouCard;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date daiDate;

    private BigDecimal onemoney;

    private BigDecimal status;


    private static final long serialVersionUID = 1L;

    public Bigdaiorder() {
    }

    @Override
    public String toString() {
        return "Bigdaiorder{" +
                "boid=" + boid +
                ", usersid=" + usersid +
                ", bdid=" + bdid +
                ", bigmoney=" + bigmoney +
                ", bigdaiDate=" + bigdaiDate +
                ", yihuan=" + yihuan +
                ", huanCard=" + huanCard +
                ", shouCard=" + shouCard +
                ", daiDate=" + daiDate +
                ", onemoney=" + onemoney +
                ", status=" + status +
                '}';
    }

    public BigDecimal getBoid() {
        return boid;
    }

    public void setBoid(BigDecimal boid) {
        this.boid = boid;
    }

    public BigDecimal getUsersid() {
        return usersid;
    }

    public void setUsersid(BigDecimal usersid) {
        this.usersid = usersid;
    }

    public BigDecimal getBdid() {
        return bdid;
    }

    public void setBdid(BigDecimal bdid) {
        this.bdid = bdid;
    }

    public BigDecimal getBigmoney() {
        return bigmoney;
    }

    public void setBigmoney(BigDecimal bigmoney) {
        this.bigmoney = bigmoney;
    }

    public BigDecimal getBigdaiDate() {
        return bigdaiDate;
    }

    public void setBigdaiDate(BigDecimal bigdaiDate) {
        this.bigdaiDate = bigdaiDate;
    }

    public BigDecimal getYihuan() {
        return yihuan;
    }

    public void setYihuan(BigDecimal yihuan) {
        this.yihuan = yihuan;
    }

    public BigDecimal getHuanCard() {
        return huanCard;
    }

    public void setHuanCard(BigDecimal huanCard) {
        this.huanCard = huanCard;
    }

    public BigDecimal getShouCard() {
        return shouCard;
    }

    public void setShouCard(BigDecimal shouCard) {
        this.shouCard = shouCard;
    }

    public Date getDaiDate() {
        return daiDate;
    }

    public void setDaiDate(Date daiDate) {
        this.daiDate = daiDate;
    }

    public BigDecimal getOnemoney() {
        return onemoney;
    }

    public void setOnemoney(BigDecimal onemoney) {
        this.onemoney = onemoney;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Bigdaiorder(BigDecimal boid, BigDecimal usersid, BigDecimal bdid, BigDecimal bigmoney, BigDecimal bigdaiDate, BigDecimal yihuan, BigDecimal huanCard, BigDecimal shouCard, Date daiDate, BigDecimal onemoney, BigDecimal status, Bigdai bigdai, Users users) {
        this.boid = boid;
        this.usersid = usersid;
        this.bdid = bdid;
        this.bigmoney = bigmoney;
        this.bigdaiDate = bigdaiDate;
        this.yihuan = yihuan;
        this.huanCard = huanCard;
        this.shouCard = shouCard;
        this.daiDate = daiDate;
        this.onemoney = onemoney;
        this.status = status;

    }
}