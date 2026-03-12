package com.reflection.basis;

import com.reflection.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ref2 {
    //性能比较
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();
    }
    public static void m1(){
        Cat cat = new Cat();
        Long begin = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        Long end = System.currentTimeMillis();
        System.out.println("m1耗时" + (end - begin));
    }
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        //反射调用方法时取消检查机制
        hi.setAccessible(true);
        Long begin = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        Long end = System.currentTimeMillis();
        System.out.println("m2耗时" + (end - begin));
    }
}
