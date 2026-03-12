package com.reflection.basis;

import com.reflection.Cat;

import java.lang.reflect.Field;

public class Ref3 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.得到Cat类的Class对象
        Class cls = Class.forName("com.reflection.Cat");
        //输出类名
        System.out.println(cls);   //得到cls的类所在（String）
        System.out.println(cls.getClass()); //得到cls的类型
        //得到包名
        System.out.println(cls.getPackage().getName());
        //得到全类名
        System.out.println(cls.getName());
        //创建实例对象
        Object o = cls.newInstance();
        Cat cat = (Cat) o;
        System.out.println(cat);
        //获取成员变量
        Field age = cls.getField("age");
        System.out.println(age.get(cat));
        //通过反射给属性设值
        cat.setAge(30);
        System.out.println(age.get(cat));
        //获得所有属性
        Field[] fields = cls.getFields();
        for (Field f:fields) {
            System.out.println(f);
        }
    }
}
