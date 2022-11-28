package com.muzili.adapter.inter;

/**
 * 双孔插座实现类
 * @author lizuoliang
 * @create 2022/11/11 11:04
 */
public class DoubleSocketImpl implements DoubleSocket{
    @Override
    public String unplugSocket() {
        return "拔出双孔插座";
    }

    @Override
    public void insetSocket(String msg) {
        System.out.println("插入双孔插座：" + msg);
    }
}
