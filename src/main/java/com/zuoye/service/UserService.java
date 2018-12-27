package com.zuoye.service;

import com.zuoye.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public User login(Map<String, String> map);
    public List<Integer> idenRole(Integer userId);
    public void regist(User user);
    public List<User> queryRoles();
    public User userDetail(Integer userId);
    public String getAuthority(Integer userId);
}
