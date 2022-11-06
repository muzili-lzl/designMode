package com.muzili.bridge;

import java.math.BigDecimal;

/**
 * 支付宝支付
 * @author lizuoliang
 * @create 2022/11/6 15:20
 */
public class ZfbPay extends Pay {

    public ZfbPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String payMethod, String traceId, BigDecimal amount) {
        System.out.println("使用支付宝支付");
        boolean payment = iPayMode.payment(payMethod);
        System.out.println("使用支付宝支付完成");
        if (payment){
            System.out.println("支付宝转账成功");
            return "200";
        }
        System.out.println("支付宝转账失败");
        return "500";
    }
}
