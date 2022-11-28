package com.muzili.template;

import java.math.BigDecimal;
import java.util.Map;

public class LoanOneMonth extends AbstractAccount{
    @Override
    public BigDecimal calculate() {
        System.out.println("一个月利息为1.7");
        return new BigDecimal(1.7).setScale(2,0);
    }
}
