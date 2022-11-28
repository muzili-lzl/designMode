package com.muzili.state;

import org.junit.Test;

public class TrafficLightTest {

    @Test
    public void trafficLightTest(){
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setTrafficState(new GreenTrafficLight());
        trafficLight.switchToYellow();
    }

}
