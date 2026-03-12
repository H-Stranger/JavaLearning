package com.reflection;

public class Cat {
    private String name = "招财猫";
    public int age = 10;
    public String hobby = "爱吃猫粮";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void hi(){
        System.out.println("小猫打招呼....");
    }
    public void cry(){
        System.out.println("小猫喵喵叫......");
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
}
