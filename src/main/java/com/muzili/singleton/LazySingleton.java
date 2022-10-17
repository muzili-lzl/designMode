package com.muzili.singleton;

/**
 * 懒汉式
 * 使用的时候才加载
 * 在多线程访问的时候存在线程不安全
 * @author lizuoliang
 * @create 2022/10/17 18:07
 */
public class LazySingleton {

    private LazySingleton(){};

    private static LazySingleton INSTANCE;

    public static LazySingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
