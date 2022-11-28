package com.muzili.template;

import org.junit.Test;

public class TemplateTest {
    @Test
    public void templateTest(){
        AbstractAccount account = new LoanSevenDays();
        account.handle("muzili", "123456");

        AbstractAccount monthAccount = new LoanOneMonth();
        monthAccount.handle("muzili", "123456");
    }
}
