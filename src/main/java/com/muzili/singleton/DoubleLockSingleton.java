package com.muzili.singleton;

/**
 * 双重锁
 * 双重锁是为了解决懒汉式加载中的线程不安全问题
 * 如果单纯的使用一个锁，同样会出现多个线程因争抢资源造成线程不安全问题
 * @author lizuoliang
 * @create 2022/10/17 18:17
 */
public class DoubleLockSingleton {

    private DoubleLockSingleton(){};

    private static volatile DoubleLockSingleton INSTANCE;

    public static DoubleLockSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleLockSingleton.class){
                // 如果单纯到这一步，不进行为空的判断，多线程争抢的情况下会存在线程不安全的问题，测试方法见main
                if (INSTANCE == null){
                    // 进入锁之后再次判断是否为空，保证线程安全性
                    INSTANCE = new DoubleLockSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(EnumSingleton.INSTANCE.hashCode())).start();
        }
    }

}
