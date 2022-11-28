package com.muzili.adapter.inter;

import org.junit.Test;

public class SocketTest {

    @Test
    public void socketTest(){
        Socket socket = new Socket();
        DoubleSocket doubleSocket = new DoubleSocketImpl();
        System.out.println(socket.unplugSocket(doubleSocket));
    }

    @Test
    public void threeHoleSocket(){
        SocketAdapter threeHoleSocket = new SocketAdapter();
        Socket socket = new Socket();
        System.out.println(socket.unplugSocket(threeHoleSocket));
    }

}
