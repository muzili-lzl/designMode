package com.muzili.proxy.dynamic;

/**
 * 动态代理源
 * @author lizuoliang
 * @create 2022/10/23 15:17
 */
public class DynamicProxySource implements DynamicMoveable {
    @Override
    public void invoke(){
        System.out.println("正常逻辑处理");
    }
}
