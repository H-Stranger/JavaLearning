package com.thread.lock;

public class DeadLock {
    public static void main(String[] args) {
        DeadLockDemo deadLockDemo1 = new DeadLockDemo(true);
        DeadLockDemo deadLockDemo2 = new DeadLockDemo(false);
        deadLockDemo1.start();
        deadLockDemo2.start();
    }
}

class DeadLockDemo extends Thread{
    static Object object1 = new Object();
    static Object object2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run(){
        if(flag){
            synchronized (object1){
                System.out.println(Thread.currentThread().getName() + "进入入口1");
                synchronized (object2){
                    System.out.println(Thread.currentThread().getName() + "进入入口2");
                }
            }
        }else{
            synchronized (object2){
                System.out.println(Thread.currentThread().getName() + "进入入口3");
                synchronized (object1){
                    System.out.println(Thread.currentThread().getName() + "进入入口4");
                }
            }
        }
    }
}
