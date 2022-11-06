package com.muzili.bridge;

import java.math.BigDecimal;

/**
 * 支付抽象类
 * @author lizuoliang
 * @create 2022/11/6 15:12
 */
public abstract class Pay {

    // 桥接对象
    protected IPayMode iPayMode;

    public Pay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }

    /**
     * 转账
     * @param payMethod    支付方式
     * @param traceId   交易id
     * @param amount    金额
     * @return
     */
    public abstract String transfer(String payMethod, String traceId, BigDecimal amount);

}
