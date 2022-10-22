package com.muzili.factory.abstrats;

public class MainMethod {

    public static void main(String[] args) {
        AbstractFactory factory = new ModernFactory();
        factory.createCar();
    }

}
