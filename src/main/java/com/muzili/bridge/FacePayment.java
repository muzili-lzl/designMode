package com.muzili.bridge;

/**
 * 脸部支付
 * @author lizuoliang
 * @create 2022/11/6 15:10
 */
public class FacePayment implements IPayMode {
    @Override
    public boolean payment(String payMethod) {
        System.out.println("使用脸部支付:" + payMethod);
        return true;
    }
}
