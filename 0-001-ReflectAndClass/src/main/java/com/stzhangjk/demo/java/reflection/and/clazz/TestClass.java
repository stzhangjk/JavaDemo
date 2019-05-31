package com.stzhangjk.demo.java.reflection.and.clazz;

public class TestClass {
    private int field1;
    private int field2;

    public static int static_field;

    static{
        System.out.println("执行静态初始化块");
        static_field = 1;
    }

    {
        System.out.println("执行初始化块");
        field1 = 1;
        field2 = 2;
    }

    public void method1(String param1, int param2){
        System.out.println("执行method1()...");
    }

    private void method2(){
        System.out.println("执行method2（）...");
    }
}
