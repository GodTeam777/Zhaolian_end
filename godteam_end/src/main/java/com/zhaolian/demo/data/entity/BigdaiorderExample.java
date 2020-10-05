package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BigdaiorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BigdaiorderExample() {
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

        public Criteria andBoidIsNull() {
            addCriterion("BOID is null");
            return (Criteria) this;
        }

        public Criteria andBoidIsNotNull() {
            addCriterion("BOID is not null");
            return (Criteria) this;
        }

        public Criteria andBoidEqualTo(BigDecimal value) {
            addCriterion("BOID =", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotEqualTo(BigDecimal value) {
            addCriterion("BOID <>", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidGreaterThan(BigDecimal value) {
            addCriterion("BOID >", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOID >=", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidLessThan(BigDecimal value) {
            addCriterion("BOID <", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOID <=", value, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidIn(List<BigDecimal> values) {
            addCriterion("BOID in", values, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotIn(List<BigDecimal> values) {
            addCriterion("BOID not in", values, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOID between", value1, value2, "boid");
            return (Criteria) this;
        }

        public Criteria andBoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOID not between", value1, value2, "boid");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNull() {
            addCriterion("USERSID is null");
            return (Criteria) this;
        }

        public Criteria andUsersidIsNotNull() {
            addCriterion("USERSID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersidEqualTo(BigDecimal value) {
            addCriterion("USERSID =", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotEqualTo(BigDecimal value) {
            addCriterion("USERSID <>", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThan(BigDecimal value) {
            addCriterion("USERSID >", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USERSID >=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThan(BigDecimal value) {
            addCriterion("USERSID <", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USERSID <=", value, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidIn(List<BigDecimal> values) {
            addCriterion("USERSID in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotIn(List<BigDecimal> values) {
            addCriterion("USERSID not in", values, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERSID between", value1, value2, "usersid");
            return (Criteria) this;
        }

        public Criteria andUsersidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USERSID not between", value1, value2, "usersid");
            return (Criteria) this;
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

        public Criteria andBigmoneyIsNull() {
            addCriterion("BIGMONEY is null");
            return (Criteria) this;
        }

        public Criteria andBigmoneyIsNotNull() {
            addCriterion("BIGMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBigmoneyEqualTo(BigDecimal value) {
            addCriterion("BIGMONEY =", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyNotEqualTo(BigDecimal value) {
            addCriterion("BIGMONEY <>", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyGreaterThan(BigDecimal value) {
            addCriterion("BIGMONEY >", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIGMONEY >=", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyLessThan(BigDecimal value) {
            addCriterion("BIGMONEY <", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIGMONEY <=", value, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyIn(List<BigDecimal> values) {
            addCriterion("BIGMONEY in", values, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyNotIn(List<BigDecimal> values) {
            addCriterion("BIGMONEY not in", values, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIGMONEY between", value1, value2, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIGMONEY not between", value1, value2, "bigmoney");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateIsNull() {
            addCriterion("BIGDAI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateIsNotNull() {
            addCriterion("BIGDAI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateEqualTo(BigDecimal value) {
            addCriterion("BIGDAI_DATE =", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateNotEqualTo(BigDecimal value) {
            addCriterion("BIGDAI_DATE <>", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateGreaterThan(BigDecimal value) {
            addCriterion("BIGDAI_DATE >", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIGDAI_DATE >=", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateLessThan(BigDecimal value) {
            addCriterion("BIGDAI_DATE <", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIGDAI_DATE <=", value, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateIn(List<BigDecimal> values) {
            addCriterion("BIGDAI_DATE in", values, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateNotIn(List<BigDecimal> values) {
            addCriterion("BIGDAI_DATE not in", values, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIGDAI_DATE between", value1, value2, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andBigdaiDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIGDAI_DATE not between", value1, value2, "bigdaiDate");
            return (Criteria) this;
        }

        public Criteria andYihuanIsNull() {
            addCriterion("YIHUAN is null");
            return (Criteria) this;
        }

        public Criteria andYihuanIsNotNull() {
            addCriterion("YIHUAN is not null");
            return (Criteria) this;
        }

        public Criteria andYihuanEqualTo(BigDecimal value) {
            addCriterion("YIHUAN =", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanNotEqualTo(BigDecimal value) {
            addCriterion("YIHUAN <>", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanGreaterThan(BigDecimal value) {
            addCriterion("YIHUAN >", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YIHUAN >=", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanLessThan(BigDecimal value) {
            addCriterion("YIHUAN <", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YIHUAN <=", value, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanIn(List<BigDecimal> values) {
            addCriterion("YIHUAN in", values, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanNotIn(List<BigDecimal> values) {
            addCriterion("YIHUAN not in", values, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YIHUAN between", value1, value2, "yihuan");
            return (Criteria) this;
        }

        public Criteria andYihuanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YIHUAN not between", value1, value2, "yihuan");
            return (Criteria) this;
        }

        public Criteria andHuanCardIsNull() {
            addCriterion("HUAN_CARD is null");
            return (Criteria) this;
        }

        public Criteria andHuanCardIsNotNull() {
            addCriterion("HUAN_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andHuanCardEqualTo(BigDecimal value) {
            addCriterion("HUAN_CARD =", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotEqualTo(BigDecimal value) {
            addCriterion("HUAN_CARD <>", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThan(BigDecimal value) {
            addCriterion("HUAN_CARD >", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HUAN_CARD >=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThan(BigDecimal value) {
            addCriterion("HUAN_CARD <", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HUAN_CARD <=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardIn(List<BigDecimal> values) {
            addCriterion("HUAN_CARD in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotIn(List<BigDecimal> values) {
            addCriterion("HUAN_CARD not in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUAN_CARD between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HUAN_CARD not between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andShouCardIsNull() {
            addCriterion("SHOU_CARD is null");
            return (Criteria) this;
        }

        public Criteria andShouCardIsNotNull() {
            addCriterion("SHOU_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andShouCardEqualTo(BigDecimal value) {
            addCriterion("SHOU_CARD =", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotEqualTo(BigDecimal value) {
            addCriterion("SHOU_CARD <>", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThan(BigDecimal value) {
            addCriterion("SHOU_CARD >", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOU_CARD >=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThan(BigDecimal value) {
            addCriterion("SHOU_CARD <", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOU_CARD <=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardIn(List<BigDecimal> values) {
            addCriterion("SHOU_CARD in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotIn(List<BigDecimal> values) {
            addCriterion("SHOU_CARD not in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOU_CARD between", value1, value2, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOU_CARD not between", value1, value2, "shouCard");
            return (Criteria) this;
        }

        public Criteria andDaiDateIsNull() {
            addCriterion("DAI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDaiDateIsNotNull() {
            addCriterion("DAI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDaiDateEqualTo(Date value) {
            addCriterion("DAI_DATE =", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateNotEqualTo(Date value) {
            addCriterion("DAI_DATE <>", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateGreaterThan(Date value) {
            addCriterion("DAI_DATE >", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAI_DATE >=", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateLessThan(Date value) {
            addCriterion("DAI_DATE <", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateLessThanOrEqualTo(Date value) {
            addCriterion("DAI_DATE <=", value, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateIn(List<Date> values) {
            addCriterion("DAI_DATE in", values, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateNotIn(List<Date> values) {
            addCriterion("DAI_DATE not in", values, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateBetween(Date value1, Date value2) {
            addCriterion("DAI_DATE between", value1, value2, "daiDate");
            return (Criteria) this;
        }

        public Criteria andDaiDateNotBetween(Date value1, Date value2) {
            addCriterion("DAI_DATE not between", value1, value2, "daiDate");
            return (Criteria) this;
        }

        public Criteria andOnemoneyIsNull() {
            addCriterion("ONEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andOnemoneyIsNotNull() {
            addCriterion("ONEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOnemoneyEqualTo(BigDecimal value) {
            addCriterion("ONEMONEY =", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyNotEqualTo(BigDecimal value) {
            addCriterion("ONEMONEY <>", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyGreaterThan(BigDecimal value) {
            addCriterion("ONEMONEY >", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ONEMONEY >=", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyLessThan(BigDecimal value) {
            addCriterion("ONEMONEY <", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ONEMONEY <=", value, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyIn(List<BigDecimal> values) {
            addCriterion("ONEMONEY in", values, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyNotIn(List<BigDecimal> values) {
            addCriterion("ONEMONEY not in", values, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ONEMONEY between", value1, value2, "onemoney");
            return (Criteria) this;
        }

        public Criteria andOnemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ONEMONEY not between", value1, value2, "onemoney");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("\"STATUS\" is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("\"STATUS\" is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("\"STATUS\" >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("\"STATUS\" <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"STATUS\" <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("\"STATUS\" in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("\"STATUS\" not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"STATUS\" between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"STATUS\" not between", value1, value2, "status");
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