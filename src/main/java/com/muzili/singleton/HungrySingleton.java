package com.muzili.singleton;

/**
 * 饿汉式(倾向)
 * 类加载到内存时就初始化一个单例
 * JVM保证线程安全
 * @author lizuoliang
 * @create 2022/10/17 18:02
 */
public class HungrySingleton {

    private HungrySingleton(){};

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

}
