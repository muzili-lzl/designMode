package com.muzili.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicTest {
    public static void main(String[] args) {
        System.out.println(SensitiveUtils.chineseName("李作良"));
        System.out.println(SensitiveUtils.mobileEncrypt("15163990643"));
        System.out.println(SensitiveUtils.idEncrypt("371323199803266918"));
//        DynamicProxySource proxySource = new DynamicProxySource();
//        // 编译执行中的文件
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
//        DynamicMoveable moveable = (DynamicMoveable) Proxy.newProxyInstance(DynamicProxySource.class.getClassLoader(),
//                new Class[]{DynamicMoveable.class},
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("执行之前的逻辑");
//                        Object invoke = method.invoke(proxySource, args);
//                        System.out.println("执行之后的逻辑");
//                        return invoke;
//                    }
//                });
//        moveable.invoke();
    }
}
