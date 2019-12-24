package com.stzhangjk.demo.java.reflection;

import org.junit.Test;

public class TestInitBlock {
    @Test
    public void test1(){
        Class<TestClass> c = TestClass.class; //都没执行
    }

    @Test
    public void test2() throws IllegalAccessException, InstantiationException {
        Class<TestClass> c = TestClass.class; //都没执行
        c.newInstance(); //执行静态初始化块+初始化块
    }

    @Test
    public void test3() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("com.stzhangjk.demo.java.reflection.TestClass"); //执行静态初始化块
        c.newInstance(); //执行初始化块
    }
}
