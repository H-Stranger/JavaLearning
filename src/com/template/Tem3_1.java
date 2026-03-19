package com.template;

public class Tem3_1 {
    public static void main(String[] args) {

    }
}
class Car<T,U>{
    private T first;
    private U last;
    public void run(){}
    public void eat(U u){} //使用类泛型
    public T getFirst(){
        return first;
    }
    public <T,R> void fly(T t,R r){} //泛型方法
}
