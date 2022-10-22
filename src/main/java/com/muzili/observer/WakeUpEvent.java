package com.muzili.observer;

import java.time.LocalDateTime;

/**
 * 发生的事件
 * @author lizuoliang
 * @create 2022/10/22 16:05
 */
public class WakeUpEvent extends Event<ObserverSource> {

    private LocalDateTime date;
    private String place;
    private ObserverSource observerSource;

    public WakeUpEvent(LocalDateTime date, String place, ObserverSource observerSource) {
        this.date = date;
        this.place = place;
        this.observerSource = observerSource;
    }

    @Override
    ObserverSource getSource() {
        return observerSource;
    }

}
