package com.muzili.state;

public class YellowTrafficLight implements TrafficState{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("转换为绿灯");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("转换为红灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("当前为黄灯，无需切换");
    }
}
