package com.muzili.factory.method;

public class Aircraft implements Moveable{
    @Override
    public void go() {
        System.out.println("工厂接口实现方式之飞机");
    }
}
