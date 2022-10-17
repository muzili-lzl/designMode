package com.muzili.singleton;

/**
 * 枚举单例
 * 既可以解决线程同步的问题，还可以防止反序列化(枚举类没有构造方法)
 * 由《Effective Java》的作者提出
 * 每一个枚举类型和定义的枚举变量在JVM中都是唯一的
 * @author lizuoliang
 * @create 2022/10/17 18:29
 */
public enum EnumSingleton {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(EnumSingleton.INSTANCE.hashCode())).start();
        }
    }

}
