package com.muzili.state;

/**
 * 红灯转换
 * @author lizuoliang
 * @create 2022/11/20 16:52
 */
public class RedTrafficLight implements TrafficState{

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("红灯无法直接切换为绿灯");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("当前为红灯，无需切换");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("转换为黄灯");
    }

}
