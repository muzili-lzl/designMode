package com.muzili.factory.method;

public class MainMethod {
    public static void main(String[] args) {
        Moveable moveable = new Car();
        moveable.go();
    }
}
