package com.muzili.adapter.inter;

/**
 * 三孔插座实现了
 * @author lizuoliang
 * @create 2022/11/11 11:07
 */
public class ThreeHoleSocketImpl implements ThreeHoleSocket{
    @Override
    public String unplugThreeSocket() {
        return "拔出三孔插座";
    }

    @Override
    public void insertThreeSocket(String msg) {
        System.out.println("插入三孔插座：" + msg);
    }
}
