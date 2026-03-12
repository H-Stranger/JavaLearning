package com.reflection.use;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.先获取Class对象
        Class<?> cls = Class.forName("com.reflection.use.User");
        //2.public无参构造
//        User o = (User)cls.newInstance();
//        o.setName("张三");
//        o.setAge(80);
        //3.public有参构造
        Constructor<?> constructor1 = cls.getConstructor(String.class);
        Object o2 = constructor1.newInstance("李四");
        System.out.println(o2);
        //4.private有参构造
        //必须用DeclaredConstructor得到private构造器会报错
        Constructor<?> constructor2 = cls.getDeclaredConstructor(int.class, String.class);
        //访问私有构造器需要设置可行
//        constructor2.setAccessible(true);
        Object o3 = constructor2.newInstance(18, "王五");
        System.out.println(o3);

    }
}

class User{
    private int age;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
