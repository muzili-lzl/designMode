package com.muzili.strategy;

/**
 * 策略模式接口
 * @author lizuoliang
 * @create 2022/10/18 14:11
 */
public interface Comparator<T> {

    /**
     * 比较方法
     * @param o1
     * @param o2
     * @return
     */
    int compare(T o1, T o2);

}
