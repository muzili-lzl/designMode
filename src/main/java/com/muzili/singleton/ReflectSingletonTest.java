package com.muzili.singleton;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;

/**
 * 反射对于单例的破坏
 * @author lizuoliang
 * @create 2022/10/30 16:46
 */
public class ReflectSingletonTest {
    public static void main(String[] args) throws Exception {
        BigDecimal a = new BigDecimal(100.00);
        BigDecimal b = new BigDecimal(0.07);
        System.out.println(a.subtract(b).setScale(2, BigDecimal.ROUND_UP));
//        Class<StaticInnerClassSingleton> clazz = StaticInnerClassSingleton.class;
//        Constructor<StaticInnerClassSingleton> constructor = clazz.getDeclaredConstructor();
//        // 允许对类中的私有成员进行操作
//        constructor.setAccessible(true);
//        /**
//         * 仍可获取到构造方法
//         * 解决方式：
//         *  判断对象是否以已创建，创建则报错
//         */
//        StaticInnerClassSingleton instance = constructor.newInstance();
//        System.out.println(instance);
    }
}
