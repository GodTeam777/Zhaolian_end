package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SamlldaiOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SamlldaiOrderExample() {
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

        public Criteria andSdoidIsNull() {
            addCriterion("SDOID is null");
            return (Criteria) this;
        }

        public Criteria andSdoidIsNotNull() {
            addCriterion("SDOID is not null");
            return (Criteria) this;
        }

        public Criteria andSdoidEqualTo(BigDecimal value) {
            addCriterion("SDOID =", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidNotEqualTo(BigDecimal value) {
            addCriterion("SDOID <>", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidGreaterThan(BigDecimal value) {
            addCriterion("SDOID >", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SDOID >=", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidLessThan(BigDecimal value) {
            addCriterion("SDOID <", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SDOID <=", value, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidIn(List<BigDecimal> values) {
            addCriterion("SDOID in", values, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidNotIn(List<BigDecimal> values) {
            addCriterion("SDOID not in", values, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDOID between", value1, value2, "sdoid");
            return (Criteria) this;
        }

        public Criteria andSdoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SDOID not between", value1, value2, "sdoid");
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

        public Criteria andDaimoneyIsNull() {
            addCriterion("DAIMONEY is null");
            return (Criteria) this;
        }

        public Criteria andDaimoneyIsNotNull() {
            addCriterion("DAIMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andDaimoneyEqualTo(BigDecimal value) {
            addCriterion("DAIMONEY =", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyNotEqualTo(BigDecimal value) {
            addCriterion("DAIMONEY <>", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyGreaterThan(BigDecimal value) {
            addCriterion("DAIMONEY >", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DAIMONEY >=", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyLessThan(BigDecimal value) {
            addCriterion("DAIMONEY <", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DAIMONEY <=", value, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyIn(List<BigDecimal> values) {
            addCriterion("DAIMONEY in", values, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyNotIn(List<BigDecimal> values) {
            addCriterion("DAIMONEY not in", values, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAIMONEY between", value1, value2, "daimoney");
            return (Criteria) this;
        }

        public Criteria andDaimoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DAIMONEY not between", value1, value2, "daimoney");
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

        public Criteria andShouCardEqualTo(String value) {
            addCriterion("SHOU_CARD =", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotEqualTo(String value) {
            addCriterion("SHOU_CARD <>", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThan(String value) {
            addCriterion("SHOU_CARD >", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardGreaterThanOrEqualTo(String value) {
            addCriterion("SHOU_CARD >=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThan(String value) {
            addCriterion("SHOU_CARD <", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLessThanOrEqualTo(String value) {
            addCriterion("SHOU_CARD <=", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardLike(String value) {
            addCriterion("SHOU_CARD like", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotLike(String value) {
            addCriterion("SHOU_CARD not like", value, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardIn(List<String> values) {
            addCriterion("SHOU_CARD in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotIn(List<String> values) {
            addCriterion("SHOU_CARD not in", values, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardBetween(String value1, String value2) {
            addCriterion("SHOU_CARD between", value1, value2, "shouCard");
            return (Criteria) this;
        }

        public Criteria andShouCardNotBetween(String value1, String value2) {
            addCriterion("SHOU_CARD not between", value1, value2, "shouCard");
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

        public Criteria andHuanCardEqualTo(String value) {
            addCriterion("HUAN_CARD =", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotEqualTo(String value) {
            addCriterion("HUAN_CARD <>", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThan(String value) {
            addCriterion("HUAN_CARD >", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardGreaterThanOrEqualTo(String value) {
            addCriterion("HUAN_CARD >=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThan(String value) {
            addCriterion("HUAN_CARD <", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLessThanOrEqualTo(String value) {
            addCriterion("HUAN_CARD <=", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardLike(String value) {
            addCriterion("HUAN_CARD like", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotLike(String value) {
            addCriterion("HUAN_CARD not like", value, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardIn(List<String> values) {
            addCriterion("HUAN_CARD in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotIn(List<String> values) {
            addCriterion("HUAN_CARD not in", values, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardBetween(String value1, String value2) {
            addCriterion("HUAN_CARD between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andHuanCardNotBetween(String value1, String value2) {
            addCriterion("HUAN_CARD not between", value1, value2, "huanCard");
            return (Criteria) this;
        }

        public Criteria andMouIsNull() {
            addCriterion("MOU is null");
            return (Criteria) this;
        }

        public Criteria andMouIsNotNull() {
            addCriterion("MOU is not null");
            return (Criteria) this;
        }

        public Criteria andMouEqualTo(Short value) {
            addCriterion("MOU =", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouNotEqualTo(Short value) {
            addCriterion("MOU <>", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouGreaterThan(Short value) {
            addCriterion("MOU >", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouGreaterThanOrEqualTo(Short value) {
            addCriterion("MOU >=", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouLessThan(Short value) {
            addCriterion("MOU <", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouLessThanOrEqualTo(Short value) {
            addCriterion("MOU <=", value, "mou");
            return (Criteria) this;
        }

        public Criteria andMouIn(List<Short> values) {
            addCriterion("MOU in", values, "mou");
            return (Criteria) this;
        }

        public Criteria andMouNotIn(List<Short> values) {
            addCriterion("MOU not in", values, "mou");
            return (Criteria) this;
        }

        public Criteria andMouBetween(Short value1, Short value2) {
            addCriterion("MOU between", value1, value2, "mou");
            return (Criteria) this;
        }

        public Criteria andMouNotBetween(Short value1, Short value2) {
            addCriterion("MOU not between", value1, value2, "mou");
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