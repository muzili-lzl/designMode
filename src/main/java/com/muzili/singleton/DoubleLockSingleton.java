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

    /**
     * 保证可见行：当volatile修饰的变量被修改时，会将修改后的变量直接写入内存中，并将其他线程中该变量的缓存置为无效，
     *  从而让那个其他线程对该变量的引用直接从内存中获取数据
     * 防止指令重排
     * 但是不保证原子性
     */
    private static volatile DoubleLockSingleton INSTANCE;

    public static DoubleLockSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleLockSingleton.class){
                // 如果单纯到这一步，不进行为空的判断，多线程争抢的情况下会存在线程不安全的问题，测试方法见main
                if (INSTANCE == null){
                    /**
                     * 进入锁之后再次判断是否为空，保证线程安全性
                     * 创建对象在JVM中会分为三步：
                     *  1.分配内存空间
                     *  2.初始化对象
                     *  3.将INSTANCE指向分配好的空间
                     *  在JVM中会进行指令重排，即执行顺序可能会变成 1 ->3 ->2，即使用volatile防止指令重排
                     */
                    INSTANCE = new DoubleLockSingleton();
                }
            }
        }
        return INSTANCE;
    }

    /**
     * 防止序列化对类进行破坏
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(EnumSingleton.INSTANCE.hashCode())).start();
        }
    }

}
