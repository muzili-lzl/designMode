package com.muzili.adapter.inter;

/**
 * 三孔插座
 * @author lizuoliang
 * @create 2022/11/11 11:06
 */
public interface ThreeHoleSocket {

    /**
     * 拔出插座
     * @return
     */
    public String unplugThreeSocket();

    /**
     * 插入插座
     * @param msg
     */
    public void insertThreeSocket(String msg);

}
