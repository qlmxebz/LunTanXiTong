package com.zuoye.service;

import com.zuoye.pojo.Role;
import com.zuoye.pojo.UserRole;

public interface UserRoleService {
    public void updateRole(UserRole userRole);
    public Role queryAuthority(Integer roleId);
}
