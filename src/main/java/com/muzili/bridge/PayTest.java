package com.muzili.bridge;

import org.junit.Test;

import java.math.BigDecimal;

public class PayTest {

    @Test
    public void payTest(){
        Pay wechatPay = new WechatPay(new FingerprintPayment());
        String transfer = wechatPay.transfer("wechat", "122", new BigDecimal(1000.00));
        System.out.println(transfer);
    }

}
