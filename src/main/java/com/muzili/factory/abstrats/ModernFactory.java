package com.muzili.factory.abstrats;

public class ModernFactory extends AbstractFactory{
    @Override
    AbstractFood createFoof() {
        return new Food();
    }

    @Override
    AbstractCar createCar() {
        return new Car();
    }

    @Override
    AbstractMushRoom createMushRoom() {
        return new MushRoom();
    }
}
