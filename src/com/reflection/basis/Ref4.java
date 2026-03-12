package com.reflection.basis;

import com.reflection.Cat;

public class Ref4 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName
        String classPath = "com.reflection.Cat";
        Class<?> cls1 = Class.forName(classPath);
        //2. 类名.class
        Class cls2 = Cat.class;
        //3. 对象.getClass()
        Cat cat = new Cat();
        Class cls3 = cat.getClass();
        //4. 通过类加载器
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class cls4 = classLoader.loadClass(classPath);

        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //5.基本数据类型
        Class<Integer> integerClass = int.class;
        //6.基本数据类型的包装类
        Class<Integer> type = Integer.TYPE;
        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());
        //二者相同
    }
}
