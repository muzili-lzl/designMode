package com.muzili.shared;

/**
 * 具体的享元类
 *  注意：在具体享元类中，需要将内部状态和外部状态分开处理
 * @author lizuoliang
 * @create 2022/11/20 15:18
 */
public class ConcreteFlyweight extends AbstractFlyweight{

    /**
     * 内部状态：instate作为一个成员变量，同一个享元对象的内部状态是一致的
     */
    private String instate;

    public ConcreteFlyweight(String instate) {
        this.instate = instate;
    }

    /**
     * 外部状态在使用的时候，通常由外部设置，不保存在享元中
     * @param state
     */
    @Override
    public void operation(String state) {
        System.out.println("享元对象的内部状态：" + instate + "，外部状态：" + state);
    }
}
