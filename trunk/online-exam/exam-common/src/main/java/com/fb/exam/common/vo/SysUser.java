package com.fb.exam.common.vo;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer userId;

    private String userName;

    private String cellPhone;

    private String email;

    private String card;

    private String loginId;

    private String pwd;

    private String sex;

    private Integer role;

    private Integer status;

    private String loginId1;

    private String loginId2;

    private String loginId3;

    private String loginId4;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone == null ? null : cellPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLoginId1() {
        return loginId1;
    }

    public void setLoginId1(String loginId1) {
        this.loginId1 = loginId1 == null ? null : loginId1.trim();
    }

    public String getLoginId2() {
        return loginId2;
    }

    public void setLoginId2(String loginId2) {
        this.loginId2 = loginId2 == null ? null : loginId2.trim();
    }

    public String getLoginId3() {
        return loginId3;
    }

    public void setLoginId3(String loginId3) {
        this.loginId3 = loginId3 == null ? null : loginId3.trim();
    }

    public String getLoginId4() {
        return loginId4;
    }

    public void setLoginId4(String loginId4) {
        this.loginId4 = loginId4 == null ? null : loginId4.trim();
    }
}