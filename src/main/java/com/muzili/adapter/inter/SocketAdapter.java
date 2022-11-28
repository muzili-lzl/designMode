package com.muzili.adapter.inter;

/**
 * 适配器类(双孔兼容三孔)
 * @author lizuoliang
 * @create 2022/11/11 11:14
 */
public class SocketAdapter extends ThreeHoleSocketImpl implements DoubleSocket{

    @Override
    public String unplugSocket() {
        System.out.println("兼容三孔插座");
        return unplugThreeSocket();
    }

    @Override
    public void insetSocket(String msg) {
        System.out.println("兼容三孔插座");
        insertThreeSocket(msg);
    }

}
