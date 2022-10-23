package com.muzili.proxy.statics;

public class MainTest {
    public static void main(String[] args) {
        new ProxyHandler(new ProxySource()).invoke();
    }
}
