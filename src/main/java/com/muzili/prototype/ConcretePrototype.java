package com.muzili.prototype;

/**
 * 具体实现类
 * @author lizuoliang
 * @create 2022/11/2 20:47
 */
public class ConcretePrototype implements Cloneable{

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void show(){
        System.out.println("存入的对象名字：" + person.getName());
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }
}
