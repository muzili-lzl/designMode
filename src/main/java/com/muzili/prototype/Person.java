package com.muzili.prototype;

/**
 * 对象
 * @author lizuoliang
 * @create 2022/11/2 20:48
 */
public class Person {

    public Person() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
