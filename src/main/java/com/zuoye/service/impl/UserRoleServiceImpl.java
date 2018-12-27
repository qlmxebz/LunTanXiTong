package com.zuoye.service.impl;

import com.zuoye.mapper.UserRoleMapper;
import com.zuoye.pojo.Role;
import com.zuoye.pojo.UserRole;
import com.zuoye.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleMapper userRoleMapper;
    public void updateRole(UserRole userRole){
        this.userRoleMapper.updateRole(userRole);
    }

    @Override
    public Role queryAuthority(Integer roleId) {
        return this.userRoleMapper.queryAuthority(roleId);
    }

}
