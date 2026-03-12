package com.reflection.basis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Ref1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.使用Properties类
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\com\\reflection\\repo.properties"));
        //2.获取资源
        String classfullpash = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
//        System.out.println("path:" + classfullpash);
//        System.out.println("method:" + method);
        //3.加载类
        Class cls = Class.forName(classfullpash);
        //4.创建类对象实例
        Object o = cls.getConstructor().newInstance();

        //得到成员变量  得不到私有
        Field age = cls.getField("age");
        System.out.println(age.get(o));
        //得到构造器
        Constructor constructor1 = cls.getConstructor();
        System.out.println(constructor1);
        Constructor constructor2 = cls.getConstructor(String.class);
        System.out.println(constructor2);


    }
}
