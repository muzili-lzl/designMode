package com.muzili.factory.method;

public class Car implements Moveable{
    @Override
    public void go() {
        System.out.println("接口工厂方法之汽车");
    }
}
