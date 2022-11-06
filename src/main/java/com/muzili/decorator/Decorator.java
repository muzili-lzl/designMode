package com.muzili.decorator;

import java.math.BigDecimal;

/**
 * 装饰者类
 * @author lizuoliang
 * @create 2022/11/6 16:56
 */
public class Decorator extends Snack {

    private Snack snack;

    public Decorator(Snack snack) {
        this.snack = snack;
    }

    @Override
    public String getDesc() {
        return desc + " " + getPrice() + " && " + snack.getDesc();
    }

    @Override
    public BigDecimal cost() {
        return super.getPrice().add(snack.cost());
    }
}
