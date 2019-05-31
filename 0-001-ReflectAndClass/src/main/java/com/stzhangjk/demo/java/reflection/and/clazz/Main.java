package com.stzhangjk.demo.java.reflection.and.clazz;

public class Main {
    public static void main(String[] args) {

        try {
            Class c = TestClass.class;
            c.newInstance(); //执行静态初始化块

            Class c1 = Class.forName("com.stzhangjk.demo.java.reflection.and.clazz.TestClass"); //执行初始化块
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
