package com.stzhangjk.demo.java.reflection;

public class TestClass {
    static{
        System.out.println("执行静态初始化块");
    }

    {
        System.out.println("执行初始化块");
    }
}
