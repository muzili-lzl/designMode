package com.muzili.proxy.statics;

/**
 * 代理目标
 * @author lizuoliang
 * @create 2022/10/23 15:07
 */
public class ProxySource implements Moveable{
    @Override
    public void invoke(){
        // 正常逻辑处理
        System.out.println("正常逻辑处理");
    }
}
