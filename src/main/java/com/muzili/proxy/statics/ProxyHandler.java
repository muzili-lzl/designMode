package com.muzili.proxy.statics;

/**
 * 代理类
 * @author lizuoliang
 * @create 2022/10/23 15:09
 */
public class ProxyHandler implements Moveable {

    Moveable moveable;

    public ProxyHandler(Moveable moveable){
        this.moveable = moveable;
    }

    @Override
    public void invoke() {
        System.out.println("代理目标之前的逻辑");
        moveable.invoke();
        System.out.println("代理目标之后的逻辑");
    }
}
