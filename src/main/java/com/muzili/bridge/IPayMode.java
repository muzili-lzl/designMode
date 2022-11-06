package com.muzili.bridge;

/**
 * 支付方式接口
 * @author lizuoliang
 * @create 2022/11/6 15:06
 */
public interface IPayMode {

    /**
     * 支付方式
     * @param payMethod 支付方式类型
     * @return
     */
    boolean payment(String payMethod);

}
