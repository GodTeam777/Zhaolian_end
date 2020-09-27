package com.zhaolian.demo.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("HID is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("HID is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(BigDecimal value) {
            addCriterion("HID =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(BigDecimal value) {
            addCriterion("HID <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(BigDecimal value) {
            addCriterion("HID >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HID >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(BigDecimal value) {
            addCriterion("HID <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HID <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<BigDecimal> values) {
            addCriterion("HID in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<BigDecimal> values) {
            addCriterion("HID not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HID between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HID not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("CARDID is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CARDID is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(BigDecimal value) {
            addCriterion("CARDID =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(BigDecimal value) {
            addCriterion("CARDID <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(BigDecimal value) {
            addCriterion("CARDID >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDID >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(BigDecimal value) {
            addCriterion("CARDID <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARDID <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<BigDecimal> values) {
            addCriterion("CARDID in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<BigDecimal> values) {
            addCriterion("CARDID not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDID between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARDID not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("UNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UNAME =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UNAME <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UNAME >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNAME >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UNAME <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UNAME <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UNAME like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UNAME not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UNAME in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UNAME not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UNAME between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UNAME not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSmalldaiIsNull() {
            addCriterion("SMALLDAI is null");
            return (Criteria) this;
        }

        public Criteria andSmalldaiIsNotNull() {
            addCriterion("SMALLDAI is not null");
            return (Criteria) this;
        }

        public Criteria andSmalldaiEqualTo(BigDecimal value) {
            addCriterion("SMALLDAI =", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiNotEqualTo(BigDecimal value) {
            addCriterion("SMALLDAI <>", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiGreaterThan(BigDecimal value) {
            addCriterion("SMALLDAI >", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SMALLDAI >=", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiLessThan(BigDecimal value) {
            addCriterion("SMALLDAI <", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SMALLDAI <=", value, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiIn(List<BigDecimal> values) {
            addCriterion("SMALLDAI in", values, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiNotIn(List<BigDecimal> values) {
            addCriterion("SMALLDAI not in", values, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMALLDAI between", value1, value2, "smalldai");
            return (Criteria) this;
        }

        public Criteria andSmalldaiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SMALLDAI not between", value1, value2, "smalldai");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("\"TYPE\" is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("\"TYPE\" is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("\"TYPE\" =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("\"TYPE\" <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("\"TYPE\" >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("\"TYPE\" >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("\"TYPE\" <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("\"TYPE\" <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<BigDecimal> values) {
            addCriterion("\"TYPE\" in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<BigDecimal> values) {
            addCriterion("\"TYPE\" not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"TYPE\" between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("\"TYPE\" not between", value1, value2, "type");
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

        public Criteria andUspwsIsNull() {
            addCriterion("USPWS is null");
            return (Criteria) this;
        }

        public Criteria andUspwsIsNotNull() {
            addCriterion("USPWS is not null");
            return (Criteria) this;
        }

        public Criteria andUspwsEqualTo(BigDecimal value) {
            addCriterion("USPWS =", value, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsNotEqualTo(BigDecimal value) {
            addCriterion("USPWS <>", value, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsGreaterThan(BigDecimal value) {
            addCriterion("USPWS >", value, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USPWS >=", value, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsLessThan(BigDecimal value) {
            addCriterion("USPWS <", value, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USPWS <=", value, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsIn(List<BigDecimal> values) {
            addCriterion("USPWS in", values, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsNotIn(List<BigDecimal> values) {
            addCriterion("USPWS not in", values, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USPWS between", value1, value2, "uspws");
            return (Criteria) this;
        }

        public Criteria andUspwsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USPWS not between", value1, value2, "uspws");
            return (Criteria) this;
        }

        public Criteria andZfpwsIsNull() {
            addCriterion("ZFPWS is null");
            return (Criteria) this;
        }

        public Criteria andZfpwsIsNotNull() {
            addCriterion("ZFPWS is not null");
            return (Criteria) this;
        }

        public Criteria andZfpwsEqualTo(BigDecimal value) {
            addCriterion("ZFPWS =", value, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsNotEqualTo(BigDecimal value) {
            addCriterion("ZFPWS <>", value, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsGreaterThan(BigDecimal value) {
            addCriterion("ZFPWS >", value, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZFPWS >=", value, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsLessThan(BigDecimal value) {
            addCriterion("ZFPWS <", value, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZFPWS <=", value, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsIn(List<BigDecimal> values) {
            addCriterion("ZFPWS in", values, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsNotIn(List<BigDecimal> values) {
            addCriterion("ZFPWS not in", values, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZFPWS between", value1, value2, "zfpws");
            return (Criteria) this;
        }

        public Criteria andZfpwsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZFPWS not between", value1, value2, "zfpws");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNull() {
            addCriterion("PETNAME is null");
            return (Criteria) this;
        }

        public Criteria andPetnameIsNotNull() {
            addCriterion("PETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPetnameEqualTo(String value) {
            addCriterion("PETNAME =", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotEqualTo(String value) {
            addCriterion("PETNAME <>", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThan(String value) {
            addCriterion("PETNAME >", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameGreaterThanOrEqualTo(String value) {
            addCriterion("PETNAME >=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThan(String value) {
            addCriterion("PETNAME <", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLessThanOrEqualTo(String value) {
            addCriterion("PETNAME <=", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameLike(String value) {
            addCriterion("PETNAME like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotLike(String value) {
            addCriterion("PETNAME not like", value, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameIn(List<String> values) {
            addCriterion("PETNAME in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotIn(List<String> values) {
            addCriterion("PETNAME not in", values, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameBetween(String value1, String value2) {
            addCriterion("PETNAME between", value1, value2, "petname");
            return (Criteria) this;
        }

        public Criteria andPetnameNotBetween(String value1, String value2) {
            addCriterion("PETNAME not between", value1, value2, "petname");
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