package com.reflection.homework;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Class<?> cls = Class.forName("java.io.File");
        Class<File> fileClass = File.class;
        //得到所有构造器
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor con:declaredConstructors) {
            System.out.println(con);
        }
        //创建对象
        Constructor<File> constructor = fileClass.getConstructor(String.class);
        File file = constructor.newInstance("E:\\mynew.txt");
        //得到方法
        Method createNewFile = fileClass.getDeclaredMethod("createNewFile");
        createNewFile.invoke(file);
    }
}
