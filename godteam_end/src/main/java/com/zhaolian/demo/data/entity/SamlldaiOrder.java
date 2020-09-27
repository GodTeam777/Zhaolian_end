package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SamlldaiOrder implements Serializable {
    private BigDecimal sdoid;

    private BigDecimal usersid;

    private BigDecimal daimoney;

    private String shouCard;

    private String huanCard;

    private Short mou;

    private Date daiDate;

    private BigDecimal yihuan;

    private BigDecimal onemoney;

    private static final long serialVersionUID = 1L;

    public BigDecimal getSdoid() {
        return sdoid;
    }

    public void setSdoid(BigDecimal sdoid) {
        this.sdoid = sdoid;
    }

    public BigDecimal getUsersid() {
        return usersid;
    }

    public void setUsersid(BigDecimal usersid) {
        this.usersid = usersid;
    }

    public BigDecimal getDaimoney() {
        return daimoney;
    }

    public void setDaimoney(BigDecimal daimoney) {
        this.daimoney = daimoney;
    }

    public String getShouCard() {
        return shouCard;
    }

    public void setShouCard(String shouCard) {
        this.shouCard = shouCard;
    }

    public String getHuanCard() {
        return huanCard;
    }

    public void setHuanCard(String huanCard) {
        this.huanCard = huanCard;
    }

    public Short getMou() {
        return mou;
    }

    public void setMou(Short mou) {
        this.mou = mou;
    }

    public Date getDaiDate() {
        return daiDate;
    }

    public void setDaiDate(Date daiDate) {
        this.daiDate = daiDate;
    }

    public BigDecimal getYihuan() {
        return yihuan;
    }

    public void setYihuan(BigDecimal yihuan) {
        this.yihuan = yihuan;
    }

    public BigDecimal getOnemoney() {
        return onemoney;
    }

    public void setOnemoney(BigDecimal onemoney) {
        this.onemoney = onemoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sdoid=").append(sdoid);
        sb.append(", usersid=").append(usersid);
        sb.append(", daimoney=").append(daimoney);
        sb.append(", shouCard=").append(shouCard);
        sb.append(", huanCard=").append(huanCard);
        sb.append(", mou=").append(mou);
        sb.append(", daiDate=").append(daiDate);
        sb.append(", yihuan=").append(yihuan);
        sb.append(", onemoney=").append(onemoney);
        sb.append("]");
        return sb.toString();
    }
}