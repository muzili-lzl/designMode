package com.muzili.template;

import java.math.BigDecimal;

public class LoanSevenDays extends AbstractAccount{
    @Override
    public BigDecimal calculate() {
        System.out.println("七天内利息为0.7");
        return new BigDecimal(0.7).setScale(2,0);
    }
}
