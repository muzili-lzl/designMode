package com.muzili.decorator;

import java.math.BigDecimal;

/**
 * 抽象组件：街边小吃
 *
 * @author lizuoliang
 * @create 2022/11/6 16:51
 */
public abstract class Snack {

    /**
     * 描述
     */
    public String desc;

    /**
     * 价格
     */
    private BigDecimal price;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 后续配料价格计算
     * @return
     */
    public abstract BigDecimal cost();

}
