package com.zuoye.pojo;

public class Authority {
    private Integer authorityId;
    private String authorityName;
    private Integer roleAuthorityId;

    public Authority() {
    }

    public Authority(Integer authorityId, String authorityName, Integer roleAuthorityId) {
        this.authorityId = authorityId;
        this.authorityName = authorityName;
        this.roleAuthorityId = roleAuthorityId;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public Integer getRoleAuthorityId() {
        return roleAuthorityId;
    }

    public void setRoleAuthorityId(Integer roleAuthorityId) {
        this.roleAuthorityId = roleAuthorityId;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authorityId=" + authorityId +
                ", authorityName='" + authorityName + '\'' +
                ", roleAuthorityId=" + roleAuthorityId +
                '}';
    }
}
