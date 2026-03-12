package com.reflection.use;

import java.lang.reflect.Field;

public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.得到Class对象
        Class<?> cls = Class.forName("com.reflection.use.Student");
        //2.创建对象
        Object o = cls.newInstance();
        //3.获得公有属性
        Field age = cls.getField("age");
        age.set(o,30);
        //4.获得私有 + 静态属性
        Field name = cls.getDeclaredField("name");//获得所有属性
        //设置访问权限
        name.setAccessible(true);
        name.set(o,"张三");
        System.out.println(o);
        name.set(null,"李四");  //静态变量的o可以替换为null
        System.out.println(name.get(null));

    }
}

class Student{
    public int age;
    private static String name;

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ",name=" + name + '}';
    }
}