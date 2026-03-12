package com.thread;

public class ThreadUse2 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Thread thread = new Thread(dog);
//        thread.start();
        //模拟静态代理模式思想
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}
class Animal{}
class Tiger extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫....." + Thread.currentThread().getName());
    }
}
class ThreadProxy implements Runnable{
    private Runnable target = null;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if(target != null) target.run();
    }
    public void start(){
        start0(); // 实现多线程
    }
    public void start0(){
        run();
    }
}
class Dog implements Runnable{
    @Override
    public void run() {
        int times = 0;
        while(true){
            try {
                System.out.println("小狗旺旺叫...." + (++times) + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 10) break;
        }
    }
}
