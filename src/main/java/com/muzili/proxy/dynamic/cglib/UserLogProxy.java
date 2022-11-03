package com.muzili.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类打印日志信息
 * @author lizuoliang
 * @create 2022/11/3 21:32
 */
public class UserLogProxy implements MethodInterceptor {

    /**
     * 生成CGLIB动态代理类方法
     * @param target    需要被代理的目标类
     * @return
     */
    public Object getLogProxy(Object target){
        // 增强器类，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调类
        enhancer.setCallback(this);
        // 返回创建对象
        return enhancer.create();
    }

    /**
     *
     * @param object    代理对象
     * @param method    目标对象中方法的method实例
     * @param args   实际参数
     * @param methodProxy   代理类对象中的方法的method实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("目标类名称:" + object.getClass() + "，目标对象中的方法:" + method.getName() + "，代理类对象:" + args.getClass() + "，代理对象方法:" + methodProxy.getSuperName());
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("后置操作");
        return result;
    }
}
