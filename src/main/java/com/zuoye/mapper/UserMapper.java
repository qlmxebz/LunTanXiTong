package com.zuoye.mapper;
import java.util.List;
import java.util.Map;

import com.zuoye.pojo.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {
    public User login(Map<String, String> map);
    public List<Integer> idenRole(Integer userId);
    public void addUser(@Param("telephone")String telephone, @Param("password")String password,@Param("userName")String userName);
    public List<User> queryRoles();
    public User userDetail(Integer userId);
    public String getAuthority(Integer userId);
}
