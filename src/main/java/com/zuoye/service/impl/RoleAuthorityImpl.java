package com.zuoye.service.impl;

import com.zuoye.mapper.RoleAuthorityMapper;
import com.zuoye.pojo.RoleAuthority;
import com.zuoye.service.RoleAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleAuthorityImpl implements RoleAuthorityService {
    @Autowired
    private RoleAuthorityMapper roleAuthorityMapper;
    @Override
    public void updateAuthority(RoleAuthority roleAuthority) {
        this.roleAuthorityMapper.updateAuthority(roleAuthority);
    }
}
