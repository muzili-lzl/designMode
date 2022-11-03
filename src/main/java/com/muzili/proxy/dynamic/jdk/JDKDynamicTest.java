package com.muzili.proxy.dynamic.jdk;


import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理之JDK代理
 * @author lizuoliang
 * @create 2022/11/2 21:53
 */
public class JDKDynamicTest {

    @Test
    public void jdkDynamicTest() {
        DynamicProxySource proxySource = new DynamicProxySource();
        // 编译执行中的文件
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        DynamicMoveable moveable = (DynamicMoveable) Proxy.newProxyInstance(DynamicProxySource.class.getClassLoader(),
                DynamicProxySource.class.getInterfaces(),
//                new Class[]{DynamicMoveable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行之前的逻辑");
                        Object invoke = method.invoke(proxySource, args);
                        System.out.println("执行之后的逻辑");
                        return invoke;
                    }
                });
        moveable.invoke();
    }

}
