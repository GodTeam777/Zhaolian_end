package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationExample() {
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

        public Criteria andEdusersidIsNull() {
            addCriterion("EDUSERSID is null");
            return (Criteria) this;
        }

        public Criteria andEdusersidIsNotNull() {
            addCriterion("EDUSERSID is not null");
            return (Criteria) this;
        }

        public Criteria andEdusersidEqualTo(BigDecimal value) {
            addCriterion("EDUSERSID =", value, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidNotEqualTo(BigDecimal value) {
            addCriterion("EDUSERSID <>", value, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidGreaterThan(BigDecimal value) {
            addCriterion("EDUSERSID >", value, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EDUSERSID >=", value, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidLessThan(BigDecimal value) {
            addCriterion("EDUSERSID <", value, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EDUSERSID <=", value, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidIn(List<BigDecimal> values) {
            addCriterion("EDUSERSID in", values, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidNotIn(List<BigDecimal> values) {
            addCriterion("EDUSERSID not in", values, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDUSERSID between", value1, value2, "edusersid");
            return (Criteria) this;
        }

        public Criteria andEdusersidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EDUSERSID not between", value1, value2, "edusersid");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("SCHOOLNAME is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("SCHOOLNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("SCHOOLNAME =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("SCHOOLNAME <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("SCHOOLNAME >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOLNAME >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("SCHOOLNAME <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("SCHOOLNAME <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("SCHOOLNAME like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("SCHOOLNAME not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("SCHOOLNAME in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("SCHOOLNAME not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("SCHOOLNAME between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("SCHOOLNAME not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("BEGIN_DATE =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("BEGIN_DATE <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("BEGIN_DATE >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("BEGIN_DATE <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("BEGIN_DATE in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("BEGIN_DATE not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("\"DEGREE\" is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("\"DEGREE\" is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("\"DEGREE\" =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("\"DEGREE\" <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("\"DEGREE\" >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("\"DEGREE\" >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("\"DEGREE\" <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("\"DEGREE\" <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("\"DEGREE\" like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("\"DEGREE\" not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("\"DEGREE\" in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("\"DEGREE\" not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("\"DEGREE\" between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("\"DEGREE\" not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andSpathIsNull() {
            addCriterion("SPATH is null");
            return (Criteria) this;
        }

        public Criteria andSpathIsNotNull() {
            addCriterion("SPATH is not null");
            return (Criteria) this;
        }

        public Criteria andSpathEqualTo(String value) {
            addCriterion("SPATH =", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotEqualTo(String value) {
            addCriterion("SPATH <>", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathGreaterThan(String value) {
            addCriterion("SPATH >", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathGreaterThanOrEqualTo(String value) {
            addCriterion("SPATH >=", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLessThan(String value) {
            addCriterion("SPATH <", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLessThanOrEqualTo(String value) {
            addCriterion("SPATH <=", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathLike(String value) {
            addCriterion("SPATH like", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotLike(String value) {
            addCriterion("SPATH not like", value, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathIn(List<String> values) {
            addCriterion("SPATH in", values, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotIn(List<String> values) {
            addCriterion("SPATH not in", values, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathBetween(String value1, String value2) {
            addCriterion("SPATH between", value1, value2, "spath");
            return (Criteria) this;
        }

        public Criteria andSpathNotBetween(String value1, String value2) {
            addCriterion("SPATH not between", value1, value2, "spath");
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

        public Criteria andNdateIsNull() {
            addCriterion("NDATE is null");
            return (Criteria) this;
        }

        public Criteria andNdateIsNotNull() {
            addCriterion("NDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNdateEqualTo(Date value) {
            addCriterion("NDATE =", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotEqualTo(Date value) {
            addCriterion("NDATE <>", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateGreaterThan(Date value) {
            addCriterion("NDATE >", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateGreaterThanOrEqualTo(Date value) {
            addCriterion("NDATE >=", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateLessThan(Date value) {
            addCriterion("NDATE <", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateLessThanOrEqualTo(Date value) {
            addCriterion("NDATE <=", value, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateIn(List<Date> values) {
            addCriterion("NDATE in", values, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotIn(List<Date> values) {
            addCriterion("NDATE not in", values, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateBetween(Date value1, Date value2) {
            addCriterion("NDATE between", value1, value2, "ndate");
            return (Criteria) this;
        }

        public Criteria andNdateNotBetween(Date value1, Date value2) {
            addCriterion("NDATE not between", value1, value2, "ndate");
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