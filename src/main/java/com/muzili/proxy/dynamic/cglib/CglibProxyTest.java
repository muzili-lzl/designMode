package com.muzili.proxy.dynamic.cglib;

import org.junit.Test;

import java.util.List;

public class CglibProxyTest {

    @Test
    public void cglibProxyTest(){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl proxyService = (UserServiceImpl) new UserLogProxy().getLogProxy(userService);
        List<User> userList = proxyService.getUserList();
        userList.stream().forEach(e -> System.out.println(e));
    }

}
