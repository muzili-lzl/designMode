package com.muzili.shared;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 享元类工厂
 *  作用：作为存储享元对象的享元池，用户获取享元对象时先从享元池中获取，有则返回；
 *      没有则新建返回给用户，并且保存在享元池中
 * @author lizuoliang
 * @create 2022/11/20 15:25
 */
public class FlyweightFactory {

    /**
     * 作为享元池，存储享元对象
     */
    private Map<String, AbstractFlyweight> map = new HashMap<>();

    public FlyweightFactory() {
        map.put("A", new ConcreteFlyweight("A"));
        map.put("B", new ConcreteFlyweight("B"));
        map.put("C", new ConcreteFlyweight("C"));
    }

    /**
     * 根据key从享元池中获取对象
     * @param key
     * @return
     */
    public AbstractFlyweight getFlyweight(String key){
        if (StringUtils.isBlank(key)){
            System.out.println("传入的key为空");
            return null;
        }
        if (map.containsKey(key)){
            System.out.println("传入的key在享元池中存在，可以直接使用：" + key);
            return map.get(key);
        }
        System.out.println("传入的key在享元池中不存在，需要手动创建：" + key);
        AbstractFlyweight flyweight = new ConcreteFlyweight(key);
        map.put(key, flyweight);
        return flyweight;
    }

}
