package com.muzili.observer;

/**
 * 抽象事件类
 * @author lizuoliang
 * @create 2022/10/22 16:08
 */
public abstract class Event<T> {

    abstract T getSource();

}
