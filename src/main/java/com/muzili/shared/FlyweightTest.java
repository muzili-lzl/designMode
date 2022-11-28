package com.muzili.shared;

import org.junit.Test;

/**
 * 享元模式测试类
 * @author lizuoliang
 * @create 2022/11/20 15:32
 */
public class FlyweightTest {

    @Test
    public void flyweightTest(){
        FlyweightFactory factory = new FlyweightFactory();
        AbstractFlyweight a1 = factory.getFlyweight("A");
        a1.operation("A1");
        AbstractFlyweight a2 = factory.getFlyweight("A");
        a2.operation("A2");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
    }

}
