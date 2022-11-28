package com.muzili.template;

/**
 * 账户抽象类
 */
public abstract class Account {

    public static final String USERNAME = "muzili";
    public static final String PASSWORD = "123456";

    /**
     * 权限校验
     * @param username
     * @param password
     * @return
     */
    public boolean validate(String username, String password){
        if (USERNAME.equals(username) && PASSWORD.equals(password)){
            return true;
        }
        return false;
    }

}
