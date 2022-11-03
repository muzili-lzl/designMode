package com.muzili.proxy.dynamic.cglib;

/**
 * 用户信息
 * @author lizuoliang
 * @create 2022/11/3 21:29
 */
public class User {

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
