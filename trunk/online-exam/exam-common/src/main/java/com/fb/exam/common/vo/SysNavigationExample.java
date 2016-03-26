package com.fb.exam.common.vo;

import java.util.ArrayList;
import java.util.List;

public class SysNavigationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer begin;

    protected Integer length;

    public SysNavigationExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setBegin(Integer begin) {
        this.begin=begin;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setLength(Integer length) {
        this.length=length;
    }

    public Integer getLength() {
        return length;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andNaIdIsNull() {
            addCriterion("na_id is null");
            return (Criteria) this;
        }

        public Criteria andNaIdIsNotNull() {
            addCriterion("na_id is not null");
            return (Criteria) this;
        }

        public Criteria andNaIdEqualTo(Integer value) {
            addCriterion("na_id =", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdNotEqualTo(Integer value) {
            addCriterion("na_id <>", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdGreaterThan(Integer value) {
            addCriterion("na_id >", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("na_id >=", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdLessThan(Integer value) {
            addCriterion("na_id <", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdLessThanOrEqualTo(Integer value) {
            addCriterion("na_id <=", value, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdIn(List<Integer> values) {
            addCriterion("na_id in", values, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdNotIn(List<Integer> values) {
            addCriterion("na_id not in", values, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdBetween(Integer value1, Integer value2) {
            addCriterion("na_id between", value1, value2, "naId");
            return (Criteria) this;
        }

        public Criteria andNaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("na_id not between", value1, value2, "naId");
            return (Criteria) this;
        }

        public Criteria andNaNameIsNull() {
            addCriterion("na_name is null");
            return (Criteria) this;
        }

        public Criteria andNaNameIsNotNull() {
            addCriterion("na_name is not null");
            return (Criteria) this;
        }

        public Criteria andNaNameEqualTo(String value) {
            addCriterion("na_name =", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameNotEqualTo(String value) {
            addCriterion("na_name <>", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameGreaterThan(String value) {
            addCriterion("na_name >", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameGreaterThanOrEqualTo(String value) {
            addCriterion("na_name >=", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameLessThan(String value) {
            addCriterion("na_name <", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameLessThanOrEqualTo(String value) {
            addCriterion("na_name <=", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameLike(String value) {
            addCriterion("na_name like", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameNotLike(String value) {
            addCriterion("na_name not like", value, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameIn(List<String> values) {
            addCriterion("na_name in", values, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameNotIn(List<String> values) {
            addCriterion("na_name not in", values, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameBetween(String value1, String value2) {
            addCriterion("na_name between", value1, value2, "naName");
            return (Criteria) this;
        }

        public Criteria andNaNameNotBetween(String value1, String value2) {
            addCriterion("na_name not between", value1, value2, "naName");
            return (Criteria) this;
        }

        public Criteria andNaDescribeIsNull() {
            addCriterion("na_describe is null");
            return (Criteria) this;
        }

        public Criteria andNaDescribeIsNotNull() {
            addCriterion("na_describe is not null");
            return (Criteria) this;
        }

        public Criteria andNaDescribeEqualTo(String value) {
            addCriterion("na_describe =", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeNotEqualTo(String value) {
            addCriterion("na_describe <>", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeGreaterThan(String value) {
            addCriterion("na_describe >", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("na_describe >=", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeLessThan(String value) {
            addCriterion("na_describe <", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeLessThanOrEqualTo(String value) {
            addCriterion("na_describe <=", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeLike(String value) {
            addCriterion("na_describe like", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeNotLike(String value) {
            addCriterion("na_describe not like", value, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeIn(List<String> values) {
            addCriterion("na_describe in", values, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeNotIn(List<String> values) {
            addCriterion("na_describe not in", values, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeBetween(String value1, String value2) {
            addCriterion("na_describe between", value1, value2, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaDescribeNotBetween(String value1, String value2) {
            addCriterion("na_describe not between", value1, value2, "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaValueIsNull() {
            addCriterion("na_value is null");
            return (Criteria) this;
        }

        public Criteria andNaValueIsNotNull() {
            addCriterion("na_value is not null");
            return (Criteria) this;
        }

        public Criteria andNaValueEqualTo(String value) {
            addCriterion("na_value =", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueNotEqualTo(String value) {
            addCriterion("na_value <>", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueGreaterThan(String value) {
            addCriterion("na_value >", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueGreaterThanOrEqualTo(String value) {
            addCriterion("na_value >=", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueLessThan(String value) {
            addCriterion("na_value <", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueLessThanOrEqualTo(String value) {
            addCriterion("na_value <=", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueLike(String value) {
            addCriterion("na_value like", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueNotLike(String value) {
            addCriterion("na_value not like", value, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueIn(List<String> values) {
            addCriterion("na_value in", values, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueNotIn(List<String> values) {
            addCriterion("na_value not in", values, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueBetween(String value1, String value2) {
            addCriterion("na_value between", value1, value2, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaValueNotBetween(String value1, String value2) {
            addCriterion("na_value not between", value1, value2, "naValue");
            return (Criteria) this;
        }

        public Criteria andNaNoIsNull() {
            addCriterion("na_no is null");
            return (Criteria) this;
        }

        public Criteria andNaNoIsNotNull() {
            addCriterion("na_no is not null");
            return (Criteria) this;
        }

        public Criteria andNaNoEqualTo(Integer value) {
            addCriterion("na_no =", value, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoNotEqualTo(Integer value) {
            addCriterion("na_no <>", value, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoGreaterThan(Integer value) {
            addCriterion("na_no >", value, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("na_no >=", value, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoLessThan(Integer value) {
            addCriterion("na_no <", value, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoLessThanOrEqualTo(Integer value) {
            addCriterion("na_no <=", value, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoIn(List<Integer> values) {
            addCriterion("na_no in", values, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoNotIn(List<Integer> values) {
            addCriterion("na_no not in", values, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoBetween(Integer value1, Integer value2) {
            addCriterion("na_no between", value1, value2, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaNoNotBetween(Integer value1, Integer value2) {
            addCriterion("na_no not between", value1, value2, "naNo");
            return (Criteria) this;
        }

        public Criteria andNaUrlIsNull() {
            addCriterion("na_url is null");
            return (Criteria) this;
        }

        public Criteria andNaUrlIsNotNull() {
            addCriterion("na_url is not null");
            return (Criteria) this;
        }

        public Criteria andNaUrlEqualTo(String value) {
            addCriterion("na_url =", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlNotEqualTo(String value) {
            addCriterion("na_url <>", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlGreaterThan(String value) {
            addCriterion("na_url >", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("na_url >=", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlLessThan(String value) {
            addCriterion("na_url <", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlLessThanOrEqualTo(String value) {
            addCriterion("na_url <=", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlLike(String value) {
            addCriterion("na_url like", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlNotLike(String value) {
            addCriterion("na_url not like", value, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlIn(List<String> values) {
            addCriterion("na_url in", values, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlNotIn(List<String> values) {
            addCriterion("na_url not in", values, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlBetween(String value1, String value2) {
            addCriterion("na_url between", value1, value2, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaUrlNotBetween(String value1, String value2) {
            addCriterion("na_url not between", value1, value2, "naUrl");
            return (Criteria) this;
        }

        public Criteria andNaStatusIsNull() {
            addCriterion("na_status is null");
            return (Criteria) this;
        }

        public Criteria andNaStatusIsNotNull() {
            addCriterion("na_status is not null");
            return (Criteria) this;
        }

        public Criteria andNaStatusEqualTo(Integer value) {
            addCriterion("na_status =", value, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusNotEqualTo(Integer value) {
            addCriterion("na_status <>", value, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusGreaterThan(Integer value) {
            addCriterion("na_status >", value, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("na_status >=", value, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusLessThan(Integer value) {
            addCriterion("na_status <", value, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("na_status <=", value, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusIn(List<Integer> values) {
            addCriterion("na_status in", values, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusNotIn(List<Integer> values) {
            addCriterion("na_status not in", values, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusBetween(Integer value1, Integer value2) {
            addCriterion("na_status between", value1, value2, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("na_status not between", value1, value2, "naStatus");
            return (Criteria) this;
        }

        public Criteria andNaNameLikeInsensitive(String value) {
            addCriterion("upper(na_name) like", value.toUpperCase(), "naName");
            return (Criteria) this;
        }

        public Criteria andNaDescribeLikeInsensitive(String value) {
            addCriterion("upper(na_describe) like", value.toUpperCase(), "naDescribe");
            return (Criteria) this;
        }

        public Criteria andNaValueLikeInsensitive(String value) {
            addCriterion("upper(na_value) like", value.toUpperCase(), "naValue");
            return (Criteria) this;
        }

        public Criteria andNaUrlLikeInsensitive(String value) {
            addCriterion("upper(na_url) like", value.toUpperCase(), "naUrl");
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