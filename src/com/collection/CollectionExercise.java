package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Dog("kitty1",20));
        list.add(new Dog("kitty2",30));
        list.add(new Dog("kitty3",40));
        System.out.println(list);
        //[Dog{name='kitty1', age=20}, Dog{name='kitty2', age=30}, Dog{name='kitty3', age=40}]
        for (Object o :list) {
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class Dog{
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
