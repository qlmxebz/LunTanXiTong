package com.zuoye.mapper;

import com.zuoye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

import static org.junit.Assert.*;
public class UserMapperTest {
    @Autowired
    UserService userService;
    public void queryRoles(){
        userService.queryRoles().stream().map(u->u.toString()).collect(Collectors.toList()).forEach(System.out::println);
    }
}