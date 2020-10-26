package com.pie.mybatis.entity;

import java.io.Serializable;

public class Test implements Serializable {
    /**
     * 主键
     */
    private Integer tId;

    /**
     * 用户名
     */
    private String tName;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}

