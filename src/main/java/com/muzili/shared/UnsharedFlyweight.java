package com.muzili.shared;

/**
 * 非共享的享元类
 * @author lizuoliang
 * @create 2022/11/20 15:24
 */
public class UnsharedFlyweight extends AbstractFlyweight{

    private String instate;

    public UnsharedFlyweight(String instate) {
        this.instate = instate;
    }

    @Override
    public void operation(String state) {
        System.out.println("非共享的享元类内部状态：" + instate + "，外部状态：" + state);
    }
}
