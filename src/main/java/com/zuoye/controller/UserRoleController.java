package com.zuoye.controller;

import com.zuoye.pojo.Role;
import com.zuoye.pojo.UserRole;
import com.zuoye.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;
    @RequestMapping("/updateRole")
    public String updateRole(@RequestBody UserRole userRole){
        this.userRoleService.updateRole(userRole);
        return "redirect:/user/queryRoles";
    }
    @RequestMapping("/queryAuthority")
    public String queryAuthority(Integer roleId, Model model){
        Role role=this.userRoleService.queryAuthority(roleId);
        model.addAttribute("role",role);
        return "authority";

    }

}
