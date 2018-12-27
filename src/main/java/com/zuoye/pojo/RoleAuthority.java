package com.zuoye.pojo;

public class RoleAuthority {
    private Integer roleAuthorityId;
    private Integer roleId;
    private Integer authorityId;

    public RoleAuthority() {
    }

    public RoleAuthority(Integer roleAuthorityId, Integer roleId, Integer authorityId) {
        this.roleAuthorityId = roleAuthorityId;
        this.roleId = roleId;
        this.authorityId = authorityId;
    }

    public Integer getRoleAuthorityId() {
        return roleAuthorityId;
    }

    public void setRoleAuthorityId(Integer roleAuthorityId) {
        this.roleAuthorityId = roleAuthorityId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    @Override
    public String toString() {
        return "RoleAuthority{" +
                "roleAuthorityId=" + roleAuthorityId +
                ", roleId=" + roleId +
                ", authorityId=" + authorityId +
                '}';
    }
}
