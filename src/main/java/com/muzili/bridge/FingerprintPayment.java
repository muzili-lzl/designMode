package com.muzili.bridge;

/**
 * 指纹支付
 * @author lizuoliang
 * @create 2022/11/6 15:09
 */
public class FingerprintPayment implements IPayMode{
    @Override
    public boolean payment(String payMethod) {
        System.out.println("使用指纹支付:" + payMethod);
        return true;
    }
}
