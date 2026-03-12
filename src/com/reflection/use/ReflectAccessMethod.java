package com.reflection.use;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.reflection.use.Boss");
        Object o = cls.newInstance();
        //1.获取方法
        Method hi = cls.getMethod("hi",String.class);
        //有形参就要加String.class !!!
        //2.调用方法
        hi.invoke(o,"Hello World");
        //3.获取静态 + 私有方法
        Method hello = cls.getDeclaredMethod("hello");
        hello.setAccessible(true);
        hello.invoke(o);
        //静态方法o可以替换为null
        //4.获取方法返回值，返回值类型为Object，但是实际运行类型为返回值类型一致
        Object returnVal = hello.invoke(null);
        System.out.println("returnVal的运行类型：" + returnVal.getClass()); //String

    }
}

class Boss{
    private int age;
    private String name;

    public void hi(String s){
        System.out.println("hi被调用...." + s);
    }
    private static String hello(){
        System.out.println("hello被调用.....");
        return "OK";
    }

    @Override
    public String toString() {
        return "Boss{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
