package com.zuoye.mapper;

import com.zuoye.pojo.Role;
import com.zuoye.pojo.UserRole;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMapper {
    public void updateRole(UserRole  userRole);
    public Role queryAuthority(Integer roleId);

}
