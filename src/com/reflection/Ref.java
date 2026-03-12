package com.reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Ref {
    //反射快速入门
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.获取文件内容
        Properties properties = new Properties();
        //FileInputStream可以相对路径和绝对路径
        properties.load(new FileInputStream("src\\com\\reflection\\repo.properties"));
        String classfullpath = properties.getProperty("classfullpath").toString();
        String method = properties.getProperty("method").toString();
        System.out.println(classfullpath + ":" + method);
        //2.获取class
        Class<?> cls = Class.forName(classfullpath);
        //3.创建对象
        Object o = cls.newInstance();
        //4.调用方法
        Method methodUse = cls.getMethod(method);
        methodUse.invoke(o);
    }
}
