package com.muzili.adapter.inter;

/**
 * 双孔插座接口
 * @author lizuoliang
 * @create 2022/11/11 11:02
 */
public interface DoubleSocket {

    /**
     * 拔出插座
     * @return
     */
    public String unplugSocket();

    /**
     * 插入插座
     * @param msg
     */
    public void insetSocket(String msg);

}
