package com.muzili.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式——观察源
 * @author lizuoliang
 * @create 2022/10/22 15:58
 */
public class ObserverSource {

    private boolean cry = false;
    private List<Observer> observerList = new ArrayList<>();
    {
        observerList.add(new ObserverOne());
        observerList.add(new ObserverTwo());
        observerList.add(new ObserverThree());
    }

    public boolean isCry(){
        return cry;
    }

    public void weekUp(){
        cry = true;
        WakeUpEvent wakeUpEvent = new WakeUpEvent(LocalDateTime.now(), "bad", this);
        for (Observer observer : observerList) {
            observer.actionEvent(wakeUpEvent);
        }
    }

}
