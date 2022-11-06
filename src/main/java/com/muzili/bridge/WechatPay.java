package com.muzili.bridge;

import java.math.BigDecimal;

/**
 * 微信支付
 * @author lizuoliang
 * @create 2022/11/6 15:15
 */
public class WechatPay extends Pay{

    public WechatPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String payMethod, String traceId, BigDecimal amount) {
        System.out.println("使用微信支付");
        boolean payment = iPayMode.payment(payMethod);
        System.out.println("使用微信支付完成");
        if (payment){
            System.out.println("微信转账成功");
            return "200";
        }
        System.out.println("微信转账失败");
        return "500";
    }

}
