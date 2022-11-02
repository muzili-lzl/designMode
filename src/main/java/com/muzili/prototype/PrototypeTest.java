package com.muzili.prototype;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * 原型对象测试类
 * @author lizuoliang
 * @create 2022/11/2 20:51
 */
public class PrototypeTest {

    /**
     * 经打印后发现原名"张三"已改为"李四"
     * 原因是进行了浅克隆，引用数据类型在浅克隆中地址一致
     * @throws CloneNotSupportedException
     */
    @Test
    public void ShallowCloneTest() throws CloneNotSupportedException {
        // 浅克隆测试
        ConcretePrototype concretePrototype = new ConcretePrototype();
        Person person = new Person();
        person.setName("张三");
        concretePrototype.setPerson(person);
        ConcretePrototype prototype = concretePrototype.clone();
        Person personClone = prototype.getPerson();
        personClone.setName("李四");
        concretePrototype.show();
        prototype.show();
    }

    /**
     * 深拷贝是借助序列化实现
     * 将对象序列化之后，引用数据类型的地址也就发生了改变，即在内存中新开了一个内存存储
     * @throws CloneNotSupportedException
     */
    @Test
    public void DeepCloneTest() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        Person person = new Person();
        person.setName("张三");
        concretePrototype.setPerson(person);
        String jsonString = JSONObject.toJSONString(concretePrototype);
        ConcretePrototype prototype = JSONObject.parseObject(jsonString, ConcretePrototype.class);
        Person personClone = prototype.getPerson();
        personClone.setName("李四");
        concretePrototype.show();
        prototype.show();
    }

}
