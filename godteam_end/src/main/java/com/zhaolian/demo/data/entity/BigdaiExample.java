package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BigdaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigdaiExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBdidIsNull() {
            addCriterion("BDID is null");
            return (Criteria) this;
        }

        public Criteria andBdidIsNotNull() {
            addCriterion("BDID is not null");
            return (Criteria) this;
        }

        public Criteria andBdidEqualTo(BigDecimal value) {
            addCriterion("BDID =", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotEqualTo(BigDecimal value) {
            addCriterion("BDID <>", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThan(BigDecimal value) {
            addCriterion("BDID >", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BDID >=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThan(BigDecimal value) {
            addCriterion("BDID <", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BDID <=", value, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidIn(List<BigDecimal> values) {
            addCriterion("BDID in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotIn(List<BigDecimal> values) {
            addCriterion("BDID not in", values, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDID between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andBdidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDID not between", value1, value2, "bdid");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("VID is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("VID is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(BigDecimal value) {
            addCriterion("VID =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(BigDecimal value) {
            addCriterion("VID <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(BigDecimal value) {
            addCriterion("VID >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VID >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(BigDecimal value) {
            addCriterion("VID <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VID <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<BigDecimal> values) {
            addCriterion("VID in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<BigDecimal> values) {
            addCriterion("VID not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VID between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VID not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNull() {
            addCriterion("BDNAME is null");
            return (Criteria) this;
        }

        public Criteria andBdnameIsNotNull() {
            addCriterion("BDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBdnameEqualTo(String value) {
            addCriterion("BDNAME =", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotEqualTo(String value) {
            addCriterion("BDNAME <>", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThan(String value) {
            addCriterion("BDNAME >", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameGreaterThanOrEqualTo(String value) {
            addCriterion("BDNAME >=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThan(String value) {
            addCriterion("BDNAME <", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLessThanOrEqualTo(String value) {
            addCriterion("BDNAME <=", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameLike(String value) {
            addCriterion("BDNAME like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotLike(String value) {
            addCriterion("BDNAME not like", value, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameIn(List<String> values) {
            addCriterion("BDNAME in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotIn(List<String> values) {
            addCriterion("BDNAME not in", values, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameBetween(String value1, String value2) {
            addCriterion("BDNAME between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdnameNotBetween(String value1, String value2) {
            addCriterion("BDNAME not between", value1, value2, "bdname");
            return (Criteria) this;
        }

        public Criteria andBdpathIsNull() {
            addCriterion("BDPATH is null");
            return (Criteria) this;
        }

        public Criteria andBdpathIsNotNull() {
            addCriterion("BDPATH is not null");
            return (Criteria) this;
        }

        public Criteria andBdpathEqualTo(String value) {
            addCriterion("BDPATH =", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotEqualTo(String value) {
            addCriterion("BDPATH <>", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathGreaterThan(String value) {
            addCriterion("BDPATH >", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathGreaterThanOrEqualTo(String value) {
            addCriterion("BDPATH >=", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathLessThan(String value) {
            addCriterion("BDPATH <", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathLessThanOrEqualTo(String value) {
            addCriterion("BDPATH <=", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathLike(String value) {
            addCriterion("BDPATH like", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotLike(String value) {
            addCriterion("BDPATH not like", value, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathIn(List<String> values) {
            addCriterion("BDPATH in", values, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotIn(List<String> values) {
            addCriterion("BDPATH not in", values, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathBetween(String value1, String value2) {
            addCriterion("BDPATH between", value1, value2, "bdpath");
            return (Criteria) this;
        }

        public Criteria andBdpathNotBetween(String value1, String value2) {
            addCriterion("BDPATH not between", value1, value2, "bdpath");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("INTEREST is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("INTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("INTEREST =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("INTEREST <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("INTEREST >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTEREST >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("INTEREST <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTEREST <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("INTEREST in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("INTEREST not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTEREST between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTEREST not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleIsNull() {
            addCriterion("BIGDAI_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleIsNotNull() {
            addCriterion("BIGDAI_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleEqualTo(String value) {
            addCriterion("BIGDAI_TITLE =", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotEqualTo(String value) {
            addCriterion("BIGDAI_TITLE <>", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleGreaterThan(String value) {
            addCriterion("BIGDAI_TITLE >", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("BIGDAI_TITLE >=", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleLessThan(String value) {
            addCriterion("BIGDAI_TITLE <", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleLessThanOrEqualTo(String value) {
            addCriterion("BIGDAI_TITLE <=", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleLike(String value) {
            addCriterion("BIGDAI_TITLE like", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotLike(String value) {
            addCriterion("BIGDAI_TITLE not like", value, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleIn(List<String> values) {
            addCriterion("BIGDAI_TITLE in", values, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotIn(List<String> values) {
            addCriterion("BIGDAI_TITLE not in", values, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleBetween(String value1, String value2) {
            addCriterion("BIGDAI_TITLE between", value1, value2, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiTitleNotBetween(String value1, String value2) {
            addCriterion("BIGDAI_TITLE not between", value1, value2, "bigdaiTitle");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyIsNull() {
            addCriterion("BIGDAI_BODY is null");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyIsNotNull() {
            addCriterion("BIGDAI_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyEqualTo(String value) {
            addCriterion("BIGDAI_BODY =", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotEqualTo(String value) {
            addCriterion("BIGDAI_BODY <>", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyGreaterThan(String value) {
            addCriterion("BIGDAI_BODY >", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyGreaterThanOrEqualTo(String value) {
            addCriterion("BIGDAI_BODY >=", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyLessThan(String value) {
            addCriterion("BIGDAI_BODY <", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyLessThanOrEqualTo(String value) {
            addCriterion("BIGDAI_BODY <=", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyLike(String value) {
            addCriterion("BIGDAI_BODY like", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotLike(String value) {
            addCriterion("BIGDAI_BODY not like", value, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyIn(List<String> values) {
            addCriterion("BIGDAI_BODY in", values, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotIn(List<String> values) {
            addCriterion("BIGDAI_BODY not in", values, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyBetween(String value1, String value2) {
            addCriterion("BIGDAI_BODY between", value1, value2, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBigdaiBodyNotBetween(String value1, String value2) {
            addCriterion("BIGDAI_BODY not between", value1, value2, "bigdaiBody");
            return (Criteria) this;
        }

        public Criteria andBdtypeIsNull() {
            addCriterion("BDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBdtypeIsNotNull() {
            addCriterion("BDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBdtypeEqualTo(String value) {
            addCriterion("BDTYPE =", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotEqualTo(String value) {
            addCriterion("BDTYPE <>", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeGreaterThan(String value) {
            addCriterion("BDTYPE >", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BDTYPE >=", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeLessThan(String value) {
            addCriterion("BDTYPE <", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeLessThanOrEqualTo(String value) {
            addCriterion("BDTYPE <=", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeLike(String value) {
            addCriterion("BDTYPE like", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotLike(String value) {
            addCriterion("BDTYPE not like", value, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeIn(List<String> values) {
            addCriterion("BDTYPE in", values, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotIn(List<String> values) {
            addCriterion("BDTYPE not in", values, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeBetween(String value1, String value2) {
            addCriterion("BDTYPE between", value1, value2, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBdtypeNotBetween(String value1, String value2) {
            addCriterion("BDTYPE not between", value1, value2, "bdtype");
            return (Criteria) this;
        }

        public Criteria andBddateIsNull() {
            addCriterion("BDDATE is null");
            return (Criteria) this;
        }

        public Criteria andBddateIsNotNull() {
            addCriterion("BDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBddateEqualTo(BigDecimal value) {
            addCriterion("BDDATE =", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateNotEqualTo(BigDecimal value) {
            addCriterion("BDDATE <>", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateGreaterThan(BigDecimal value) {
            addCriterion("BDDATE >", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BDDATE >=", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateLessThan(BigDecimal value) {
            addCriterion("BDDATE <", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BDDATE <=", value, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateIn(List<BigDecimal> values) {
            addCriterion("BDDATE in", values, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateNotIn(List<BigDecimal> values) {
            addCriterion("BDDATE not in", values, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDDATE between", value1, value2, "bddate");
            return (Criteria) this;
        }

        public Criteria andBddateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BDDATE not between", value1, value2, "bddate");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyIsNull() {
            addCriterion("SMALL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyIsNotNull() {
            addCriterion("SMALL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyEqualTo(BigDecimal value) {
            addCriterion("SMALL_MONEY =", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyNotEqualTo(BigDecimal value) {
            addCriterion("SMALL_MONEY <>", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyGreaterThan(BigDecimal value) {
            addCriterion("SMALL_MONEY >", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMALL_MONEY >=", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyLessThan(BigDecimal value) {
            addCriterion("SMALL_MONEY <", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMALL_MONEY <=", value, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyIn(List<BigDecimal> values) {
            addCriterion("SMALL_MONEY in", values, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyNotIn(List<BigDecimal> values) {
            addCriterion("SMALL_MONEY not in", values, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMALL_MONEY between", value1, value2, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andSmallMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMALL_MONEY not between", value1, value2, "smallMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIsNull() {
            addCriterion("BIG_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIsNotNull() {
            addCriterion("BIG_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBigMoneyEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY =", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY <>", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyGreaterThan(BigDecimal value) {
            addCriterion("BIG_MONEY >", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY >=", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyLessThan(BigDecimal value) {
            addCriterion("BIG_MONEY <", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIG_MONEY <=", value, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyIn(List<BigDecimal> values) {
            addCriterion("BIG_MONEY in", values, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotIn(List<BigDecimal> values) {
            addCriterion("BIG_MONEY not in", values, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIG_MONEY between", value1, value2, "bigMoney");
            return (Criteria) this;
        }

        public Criteria andBigMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIG_MONEY not between", value1, value2, "bigMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}