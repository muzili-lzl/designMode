package com.muzili.proxy.dynamic.cglib;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用户具体的类
 * @author lizuoliang
 * @create 2022/11/3 21:30
 */
public class UserServiceImpl {

    public List<User> getUserList(){
        System.out.println("原始类执行");
        return Collections.singletonList(new User("姓名", 12));
    }

}
