package com.zhaolian.demo.data.entity;

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

    private Date daiDate;

    private BigDecimal onemoney;

    private BigDecimal status;

    private static final long serialVersionUID = 1L;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", boid=").append(boid);
        sb.append(", usersid=").append(usersid);
        sb.append(", bdid=").append(bdid);
        sb.append(", bigmoney=").append(bigmoney);
        sb.append(", bigdaiDate=").append(bigdaiDate);
        sb.append(", yihuan=").append(yihuan);
        sb.append(", huanCard=").append(huanCard);
        sb.append(", shouCard=").append(shouCard);
        sb.append(", daiDate=").append(daiDate);
        sb.append(", onemoney=").append(onemoney);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}