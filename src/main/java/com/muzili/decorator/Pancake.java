package com.muzili.decorator;

import java.math.BigDecimal;

/**
 * 具体组件：煎饼果子
 * @author lizuoliang
 * @create 2022/11/6 16:53
 */
public class Pancake extends Snack {

    public Pancake(){
        setPrice(new BigDecimal(5.0));
        setDesc("初始煎饼果子费用：" + getPrice() + "元");
    }

    @Override
    public BigDecimal cost() {
        return super.getPrice();
    }

}
