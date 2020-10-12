package com.zhaolian.demo.data.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Users implements Serializable {
    private BigDecimal usersid;

    private BigDecimal edusersid;

    private BigDecimal cid;

    private BigDecimal hid;

    private BigDecimal cardid;

    private String uname;

    private String sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String phone;

    private BigDecimal smalldai;

    private BigDecimal type;

    private BigDecimal status;

    private BigDecimal uspws;

    private BigDecimal zfpws;

    private String petname;

    private static final long serialVersionUID = 1L;

    public BigDecimal getUsersid() {
        return usersid;
    }

    public void setUsersid(BigDecimal usersid) {
        this.usersid = usersid;
    }

    public BigDecimal getEdusersid() {
        return edusersid;
    }

    public void setEdusersid(BigDecimal edusersid) {
        this.edusersid = edusersid;
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public BigDecimal getHid() {
        return hid;
    }

    public void setHid(BigDecimal hid) {
        this.hid = hid;
    }

    public BigDecimal getCardid() {
        return cardid;
    }

    public void setCardid(BigDecimal cardid) {
        this.cardid = cardid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getSmalldai() {
        return smalldai;
    }

    public void setSmalldai(BigDecimal smalldai) {
        this.smalldai = smalldai;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getUspws() {
        return uspws;
    }

    public void setUspws(BigDecimal uspws) {
        this.uspws = uspws;
    }

    public BigDecimal getZfpws() {
        return zfpws;
    }

    public void setZfpws(BigDecimal zfpws) {
        this.zfpws = zfpws;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usersid=").append(usersid);
        sb.append(", edusersid=").append(edusersid);
        sb.append(", cid=").append(cid);
        sb.append(", hid=").append(hid);
        sb.append(", cardid=").append(cardid);
        sb.append(", uname=").append(uname);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", phone=").append(phone);
        sb.append(", smalldai=").append(smalldai);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", uspws=").append(uspws);
        sb.append(", zfpws=").append(zfpws);
        sb.append(", petname=").append(petname);
        sb.append("]");
        return sb.toString();
    }
}