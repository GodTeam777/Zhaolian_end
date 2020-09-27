package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Car implements Serializable {
    private BigDecimal cid;

    private String carbrand;

    private String carid;

    private String caraddress;

    private String cpath;

    private BigDecimal status;

    private static final long serialVersionUID = 1L;

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getCaraddress() {
        return caraddress;
    }

    public void setCaraddress(String caraddress) {
        this.caraddress = caraddress;
    }

    public String getCpath() {
        return cpath;
    }

    public void setCpath(String cpath) {
        this.cpath = cpath;
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
        sb.append(", cid=").append(cid);
        sb.append(", carbrand=").append(carbrand);
        sb.append(", carid=").append(carid);
        sb.append(", caraddress=").append(caraddress);
        sb.append(", cpath=").append(cpath);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}