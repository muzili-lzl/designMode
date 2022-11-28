package com.muzili.adapter.object;

import com.muzili.adapter.inter.Socket;
import org.junit.Test;

public class SocketObjectTest {

    @Test
    public void socketTest(){
        Socket socket = new Socket();
        System.out.println(socket.unplugSocket(new SocketObjectAdapter()));
    }

}
