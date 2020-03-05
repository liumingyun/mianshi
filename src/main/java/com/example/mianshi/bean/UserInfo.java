package com.example.mianshi.bean;

/**
 * @author liumingyun
 * @description 映射用戶信息表字段
 * @date 2020/3/513:59
 */
public class UserInfo {

    private  String id;
    /**
     * 姓名
     */
    private  String username;
    /**
     * 密碼
     */
    private  String password;
    /**
     * 郵箱
      */
    private  String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
