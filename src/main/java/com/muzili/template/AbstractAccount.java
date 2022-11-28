package com.muzili.template;

import java.math.BigDecimal;

/**
 * 账户抽象类
 * @author lizuoliang
 * @create 2022/11/15 16:54
 */
public abstract class AbstractAccount {

    public static final String USERNAME = "muzili";
    public static final String PASSWORD = "123456";

    /**
     * 权限校验
     * @param username
     * @param password
     * @return
     */
    public boolean validate(String username, String password){
        System.out.println("账号：" + username + "，密码：" + password);
        if (USERNAME.equals(username) && PASSWORD.equals(password)){
            return true;
        }
        return false;
    }

    /**
     * 计算利息
     * @return
     */
    public abstract BigDecimal calculate();

    /**
     * 利息展示
     * @return
     */
    public BigDecimal display(){
        BigDecimal calculate = calculate();
        System.out.println("展示利息：" + calculate);
        return calculate;
    }

    public void handle(String username, String password){
        if (!validate(username, password)){
            System.out.println("账户密码错误");
            return;
        }
        display();
    }

}
