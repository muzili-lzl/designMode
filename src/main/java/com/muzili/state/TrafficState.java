package com.muzili.state;

/**
 * 交通灯状态接口
 * @author lizuoliang
 * @create 2022/11/20 16:49
 */
public interface TrafficState {

    /**
     * 转换为绿灯
     * @param trafficLight
     */
    public void switchToGreen(TrafficLight trafficLight);

    /**
     * 转换为红灯
     * @param trafficLight
     */
    public void switchToRed(TrafficLight trafficLight);

    /**
     * 转换为黄灯
     * @param trafficLight
     */
    public void switchToYellow(TrafficLight trafficLight);

}
