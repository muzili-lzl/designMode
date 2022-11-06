package com.muzili.bridge;

/**
 * 密码支付
 * @author lizuoliang
 * @create 2022/11/6 15:12
 */
public class PasswordPayment implements IPayMode {
    @Override
    public boolean payment(String payMethod) {
        System.out.println("使用密码支付:" + payMethod);
        return true;
    }
}
