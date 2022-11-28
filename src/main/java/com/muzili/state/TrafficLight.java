package com.muzili.state;

public class TrafficLight {

    private TrafficState trafficState = new RedTrafficLight();

    public void setTrafficState(TrafficState trafficState) {
        this.trafficState = trafficState;
    }

    public void switchToRed(){
        trafficState.switchToRed(this);
    }

    public void switchToGreen(){
        trafficState.switchToGreen(this);
    }

    public void switchToYellow(){
        trafficState.switchToYellow(this);
    }
}
