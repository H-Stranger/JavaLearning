package com.reflection.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.reflection.homework.PrivateTest");
        Object o = cls.newInstance();
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name);  //输出的是name的class
        System.out.println(name.get(o));
        //修改属性值
        name.set(o,"bobo");
        //调用方法
        Method getName = cls.getDeclaredMethod("getName");
        System.out.println(getName.invoke(o));
    }
}

class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}
