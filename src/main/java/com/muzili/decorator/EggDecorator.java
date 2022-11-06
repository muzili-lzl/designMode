package com.muzili.decorator;

import java.math.BigDecimal;

/**
 * 煎饼果子加鸡蛋
 * @author lizuoliang
 * @create 2022/11/6 16:59
 */
public class EggDecorator extends Decorator {

    public EggDecorator(Snack snack) {
        super(snack);
        setDesc("鸡蛋");
        setPrice(new BigDecimal(2));
    }

}
