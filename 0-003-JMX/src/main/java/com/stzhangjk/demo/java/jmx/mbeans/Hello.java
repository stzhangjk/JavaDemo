package com.stzhangjk.demo.java.jmx.mbeans;

public class Hello implements HelloMBean {

    private int cacheSize = 200;

    @Override
    public int getCacheSize() {
        return cacheSize;
    }

    @Override
    public int add(int a, int b) {
        return 0;
    }
}
