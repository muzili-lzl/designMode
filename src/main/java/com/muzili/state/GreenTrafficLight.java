package com.muzili.state;

public class GreenTrafficLight implements TrafficState{

    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("当前为绿灯，无需切换");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("绿灯无法直接切换为红灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("转换为黄灯");
    }
}
