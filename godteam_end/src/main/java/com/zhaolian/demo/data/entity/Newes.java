package com.zhaolian.demo.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Newes implements Serializable {
    private BigDecimal nid;

    private String newsTitle;

    private String newsBody;

    private String chubanshe;

    private String fabiaoname;

    private Date newsDate;

    private BigDecimal ntype;

    private static final long serialVersionUID = 1L;

    public BigDecimal getNid() {
        return nid;
    }

    public void setNid(BigDecimal nid) {
        this.nid = nid;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    public String getChubanshe() {
        return chubanshe;
    }

    public void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }

    public String getFabiaoname() {
        return fabiaoname;
    }

    public void setFabiaoname(String fabiaoname) {
        this.fabiaoname = fabiaoname;
    }

    public Date getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(Date newsDate) {
        this.newsDate = newsDate;
    }

    public BigDecimal getNtype() {
        return ntype;
    }

    public void setNtype(BigDecimal ntype) {
        this.ntype = ntype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nid=").append(nid);
        sb.append(", newsTitle=").append(newsTitle);
        sb.append(", newsBody=").append(newsBody);
        sb.append(", chubanshe=").append(chubanshe);
        sb.append(", fabiaoname=").append(fabiaoname);
        sb.append(", newsDate=").append(newsDate);
        sb.append(", ntype=").append(ntype);
        sb.append("]");
        return sb.toString();
    }
}