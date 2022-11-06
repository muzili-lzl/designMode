package com.muzili.decorator;

import org.junit.Test;

/**
 * 装饰者模式测试类
 * @author lizuoliang
 * @create 2022/11/6 17:00
 */
public class DecoratorTest {

    @Test
    public void eggDecoratorTest(){
        Snack snack = new Pancake();
        System.out.println("初始手抓饼费用：" + snack.cost());
        System.out.println("描述：" + snack.getDesc());

        snack = new EggDecorator(snack);
        System.out.println("有钱，加个蛋的费用：" + snack.cost());
        System.out.println("描述：" + snack.getDesc());
    }

}
