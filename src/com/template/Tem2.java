package com.template;


import java.util.Arrays;

public class Tem2 {
    public static void main(String[] args) {
//        String[] ss = new String[]{"Orange", "Apple", "Pear" };
//        //Arrays工具类
//        Arrays.sort(ss);
//        //内存地址
//        System.out.println(ss);
//        System.out.println(Arrays.toString(ss));
        Person[] ps = new Person[] {
                new Person("Bob", 61),
                new Person("Alice", 88),
                new Person("Lily", 75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return this.name + "," + this.score;
    }
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
