package com.muzili.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicTest {
    public static void main(String[] args) {
        DynamicProxySource proxySource = new DynamicProxySource();
        // 编译执行中的文件
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        DynamicMoveable moveable = (DynamicMoveable) Proxy.newProxyInstance(DynamicProxySource.class.getClassLoader(),
                new Class[]{DynamicMoveable.class},
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
