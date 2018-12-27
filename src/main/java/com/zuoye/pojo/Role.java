package com.zuoye.pojo;

import java.util.List;

public class Role {
    private Integer roleId;
    private String roleName;
    private String authorityName;
    private List<User> users;
    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }



    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }



    public Role() {
    }

    public Role(Integer roleId, String roleName,List<User> users,String authorityName) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.users=users;
        this.authorityName=authorityName;


    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }




}
