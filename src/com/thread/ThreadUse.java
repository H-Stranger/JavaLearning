package com.thread;

public class ThreadUse {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程在执行" + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
//线程通过start启动，需编写run
//某个类只要继承线程，就会变成线程
class Cat extends Thread{
    @Override
    public void run(){
        int times = 0;
        while(true){
            System.out.println("小喵咪" + (++times) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break;
            }
        }
    }
}
