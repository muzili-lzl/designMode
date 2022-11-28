package com.muzili.adapter.object;

import com.muzili.adapter.inter.DoubleSocket;
import com.muzili.adapter.inter.ThreeHoleSocket;
import com.muzili.adapter.inter.ThreeHoleSocketImpl;

/**
 * 对象适配器类
 * @author lizuoliang
 * @create 2022/11/13 15:12
 */
public class SocketObjectAdapter implements DoubleSocket {

    private ThreeHoleSocket threeHoleSocket = new ThreeHoleSocketImpl();

    @Override
    public String unplugSocket() {
        System.out.println("对象适配器模式拔出插头");
        return threeHoleSocket.unplugThreeSocket();
    }

    @Override
    public void insetSocket(String msg) {
        System.out.println("对象适配器模式插入插头");
        threeHoleSocket.insertThreeSocket(msg);
    }
}
