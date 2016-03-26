package com.fb.exam.common.vo;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer begin;

    protected Integer length;

    public SysUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIsNull() {
            addCriterion("cell_phone is null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIsNotNull() {
            addCriterion("cell_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneEqualTo(String value) {
            addCriterion("cell_phone =", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotEqualTo(String value) {
            addCriterion("cell_phone <>", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneGreaterThan(String value) {
            addCriterion("cell_phone >", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cell_phone >=", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLessThan(String value) {
            addCriterion("cell_phone <", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLessThanOrEqualTo(String value) {
            addCriterion("cell_phone <=", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLike(String value) {
            addCriterion("cell_phone like", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotLike(String value) {
            addCriterion("cell_phone not like", value, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneIn(List<String> values) {
            addCriterion("cell_phone in", values, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotIn(List<String> values) {
            addCriterion("cell_phone not in", values, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneBetween(String value1, String value2) {
            addCriterion("cell_phone between", value1, value2, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNotBetween(String value1, String value2) {
            addCriterion("cell_phone not between", value1, value2, "cellPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("login_id like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("login_id not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(Integer value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(Integer value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(Integer value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(Integer value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(Integer value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<Integer> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<Integer> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(Integer value1, Integer value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(Integer value1, Integer value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLoginId1IsNull() {
            addCriterion("login_id_1 is null");
            return (Criteria) this;
        }

        public Criteria andLoginId1IsNotNull() {
            addCriterion("login_id_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLoginId1EqualTo(String value) {
            addCriterion("login_id_1 =", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1NotEqualTo(String value) {
            addCriterion("login_id_1 <>", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1GreaterThan(String value) {
            addCriterion("login_id_1 >", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1GreaterThanOrEqualTo(String value) {
            addCriterion("login_id_1 >=", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1LessThan(String value) {
            addCriterion("login_id_1 <", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1LessThanOrEqualTo(String value) {
            addCriterion("login_id_1 <=", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1Like(String value) {
            addCriterion("login_id_1 like", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1NotLike(String value) {
            addCriterion("login_id_1 not like", value, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1In(List<String> values) {
            addCriterion("login_id_1 in", values, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1NotIn(List<String> values) {
            addCriterion("login_id_1 not in", values, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1Between(String value1, String value2) {
            addCriterion("login_id_1 between", value1, value2, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId1NotBetween(String value1, String value2) {
            addCriterion("login_id_1 not between", value1, value2, "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId2IsNull() {
            addCriterion("login_id_2 is null");
            return (Criteria) this;
        }

        public Criteria andLoginId2IsNotNull() {
            addCriterion("login_id_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLoginId2EqualTo(String value) {
            addCriterion("login_id_2 =", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2NotEqualTo(String value) {
            addCriterion("login_id_2 <>", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2GreaterThan(String value) {
            addCriterion("login_id_2 >", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2GreaterThanOrEqualTo(String value) {
            addCriterion("login_id_2 >=", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2LessThan(String value) {
            addCriterion("login_id_2 <", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2LessThanOrEqualTo(String value) {
            addCriterion("login_id_2 <=", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2Like(String value) {
            addCriterion("login_id_2 like", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2NotLike(String value) {
            addCriterion("login_id_2 not like", value, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2In(List<String> values) {
            addCriterion("login_id_2 in", values, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2NotIn(List<String> values) {
            addCriterion("login_id_2 not in", values, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2Between(String value1, String value2) {
            addCriterion("login_id_2 between", value1, value2, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId2NotBetween(String value1, String value2) {
            addCriterion("login_id_2 not between", value1, value2, "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId3IsNull() {
            addCriterion("login_id_3 is null");
            return (Criteria) this;
        }

        public Criteria andLoginId3IsNotNull() {
            addCriterion("login_id_3 is not null");
            return (Criteria) this;
        }

        public Criteria andLoginId3EqualTo(String value) {
            addCriterion("login_id_3 =", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3NotEqualTo(String value) {
            addCriterion("login_id_3 <>", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3GreaterThan(String value) {
            addCriterion("login_id_3 >", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3GreaterThanOrEqualTo(String value) {
            addCriterion("login_id_3 >=", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3LessThan(String value) {
            addCriterion("login_id_3 <", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3LessThanOrEqualTo(String value) {
            addCriterion("login_id_3 <=", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3Like(String value) {
            addCriterion("login_id_3 like", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3NotLike(String value) {
            addCriterion("login_id_3 not like", value, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3In(List<String> values) {
            addCriterion("login_id_3 in", values, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3NotIn(List<String> values) {
            addCriterion("login_id_3 not in", values, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3Between(String value1, String value2) {
            addCriterion("login_id_3 between", value1, value2, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId3NotBetween(String value1, String value2) {
            addCriterion("login_id_3 not between", value1, value2, "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId4IsNull() {
            addCriterion("login_id_4 is null");
            return (Criteria) this;
        }

        public Criteria andLoginId4IsNotNull() {
            addCriterion("login_id_4 is not null");
            return (Criteria) this;
        }

        public Criteria andLoginId4EqualTo(String value) {
            addCriterion("login_id_4 =", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4NotEqualTo(String value) {
            addCriterion("login_id_4 <>", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4GreaterThan(String value) {
            addCriterion("login_id_4 >", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4GreaterThanOrEqualTo(String value) {
            addCriterion("login_id_4 >=", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4LessThan(String value) {
            addCriterion("login_id_4 <", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4LessThanOrEqualTo(String value) {
            addCriterion("login_id_4 <=", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4Like(String value) {
            addCriterion("login_id_4 like", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4NotLike(String value) {
            addCriterion("login_id_4 not like", value, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4In(List<String> values) {
            addCriterion("login_id_4 in", values, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4NotIn(List<String> values) {
            addCriterion("login_id_4 not in", values, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4Between(String value1, String value2) {
            addCriterion("login_id_4 between", value1, value2, "loginId4");
            return (Criteria) this;
        }

        public Criteria andLoginId4NotBetween(String value1, String value2) {
            addCriterion("login_id_4 not between", value1, value2, "loginId4");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(user_name) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andCellPhoneLikeInsensitive(String value) {
            addCriterion("upper(cell_phone) like", value.toUpperCase(), "cellPhone");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andCardLikeInsensitive(String value) {
            addCriterion("upper(card) like", value.toUpperCase(), "card");
            return (Criteria) this;
        }

        public Criteria andLoginIdLikeInsensitive(String value) {
            addCriterion("upper(login_id) like", value.toUpperCase(), "loginId");
            return (Criteria) this;
        }

        public Criteria andPwdLikeInsensitive(String value) {
            addCriterion("upper(pwd) like", value.toUpperCase(), "pwd");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andLoginId1LikeInsensitive(String value) {
            addCriterion("upper(login_id_1) like", value.toUpperCase(), "loginId1");
            return (Criteria) this;
        }

        public Criteria andLoginId2LikeInsensitive(String value) {
            addCriterion("upper(login_id_2) like", value.toUpperCase(), "loginId2");
            return (Criteria) this;
        }

        public Criteria andLoginId3LikeInsensitive(String value) {
            addCriterion("upper(login_id_3) like", value.toUpperCase(), "loginId3");
            return (Criteria) this;
        }

        public Criteria andLoginId4LikeInsensitive(String value) {
            addCriterion("upper(login_id_4) like", value.toUpperCase(), "loginId4");
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