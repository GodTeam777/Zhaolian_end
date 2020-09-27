package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(BigDecimal value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(BigDecimal value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(BigDecimal value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(BigDecimal value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<BigDecimal> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<BigDecimal> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNull() {
            addCriterion("CARBRAND is null");
            return (Criteria) this;
        }

        public Criteria andCarbrandIsNotNull() {
            addCriterion("CARBRAND is not null");
            return (Criteria) this;
        }

        public Criteria andCarbrandEqualTo(String value) {
            addCriterion("CARBRAND =", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotEqualTo(String value) {
            addCriterion("CARBRAND <>", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThan(String value) {
            addCriterion("CARBRAND >", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandGreaterThanOrEqualTo(String value) {
            addCriterion("CARBRAND >=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThan(String value) {
            addCriterion("CARBRAND <", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLessThanOrEqualTo(String value) {
            addCriterion("CARBRAND <=", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandLike(String value) {
            addCriterion("CARBRAND like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotLike(String value) {
            addCriterion("CARBRAND not like", value, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandIn(List<String> values) {
            addCriterion("CARBRAND in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotIn(List<String> values) {
            addCriterion("CARBRAND not in", values, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandBetween(String value1, String value2) {
            addCriterion("CARBRAND between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCarbrandNotBetween(String value1, String value2) {
            addCriterion("CARBRAND not between", value1, value2, "carbrand");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("CARID is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("CARID is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("CARID =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("CARID <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("CARID >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("CARID >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("CARID <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("CARID <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("CARID like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("CARID not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("CARID in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("CARID not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("CARID between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("CARID not between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaraddressIsNull() {
            addCriterion("CARADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCaraddressIsNotNull() {
            addCriterion("CARADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCaraddressEqualTo(String value) {
            addCriterion("CARADDRESS =", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressNotEqualTo(String value) {
            addCriterion("CARADDRESS <>", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressGreaterThan(String value) {
            addCriterion("CARADDRESS >", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressGreaterThanOrEqualTo(String value) {
            addCriterion("CARADDRESS >=", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressLessThan(String value) {
            addCriterion("CARADDRESS <", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressLessThanOrEqualTo(String value) {
            addCriterion("CARADDRESS <=", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressLike(String value) {
            addCriterion("CARADDRESS like", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressNotLike(String value) {
            addCriterion("CARADDRESS not like", value, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressIn(List<String> values) {
            addCriterion("CARADDRESS in", values, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressNotIn(List<String> values) {
            addCriterion("CARADDRESS not in", values, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressBetween(String value1, String value2) {
            addCriterion("CARADDRESS between", value1, value2, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCaraddressNotBetween(String value1, String value2) {
            addCriterion("CARADDRESS not between", value1, value2, "caraddress");
            return (Criteria) this;
        }

        public Criteria andCpathIsNull() {
            addCriterion("CPATH is null");
            return (Criteria) this;
        }

        public Criteria andCpathIsNotNull() {
            addCriterion("CPATH is not null");
            return (Criteria) this;
        }

        public Criteria andCpathEqualTo(String value) {
            addCriterion("CPATH =", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathNotEqualTo(String value) {
            addCriterion("CPATH <>", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathGreaterThan(String value) {
            addCriterion("CPATH >", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathGreaterThanOrEqualTo(String value) {
            addCriterion("CPATH >=", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathLessThan(String value) {
            addCriterion("CPATH <", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathLessThanOrEqualTo(String value) {
            addCriterion("CPATH <=", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathLike(String value) {
            addCriterion("CPATH like", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathNotLike(String value) {
            addCriterion("CPATH not like", value, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathIn(List<String> values) {
            addCriterion("CPATH in", values, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathNotIn(List<String> values) {
            addCriterion("CPATH not in", values, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathBetween(String value1, String value2) {
            addCriterion("CPATH between", value1, value2, "cpath");
            return (Criteria) this;
        }

        public Criteria andCpathNotBetween(String value1, String value2) {
            addCriterion("CPATH not between", value1, value2, "cpath");
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