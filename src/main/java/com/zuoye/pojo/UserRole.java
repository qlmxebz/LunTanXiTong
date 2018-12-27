package com.zuoye.pojo;

public class UserRole {
    private Integer userRoleId;
    private Integer userId;
    private Integer roleId;
    private String  userName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    private String  roleName;

    public UserRole() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserRole(Integer userRoleId, Integer userId, Integer roleId, String  userName,String roleName) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.roleId = roleId;
        this.userName=userName;
        this.roleName=roleName;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userRoleId=" + userRoleId +
                ", userId=" + userId +
                ", roleId=" + roleId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
