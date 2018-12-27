package com.zuoye.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class User implements Serializable {


    private static final long serialVersionUID = -1581691088397097000L;

    private String telephone;
    private Integer userId;
    private String password;
    private String userName;
    private List<Role> roles;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "telephone='" + telephone + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", roles=" + roles +
                '}';
    }
}
