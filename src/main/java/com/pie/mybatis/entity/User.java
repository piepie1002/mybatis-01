package com.pie.mybatis.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * 主键
     */
    private Integer uId;

    /**
     * 用户名
     */
    private String uName;

    /**
     * 密码
     */
    private String uPassword;

    /**
     * 状态 0表示未删除 1表示删除
     */
    private Byte uStatus;

    private static final long serialVersionUID = 1L;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Byte getuStatus() {
        return uStatus;
    }

    public void setuStatus(Byte uStatus) {
        this.uStatus = uStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uStatus=" + uStatus +
                '}';
    }
}

