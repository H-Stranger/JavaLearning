package com.thread;
//守护线程
public class ThreadMethod3 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //设置子线程为守护线程，其他线程结束，子线程自动结束
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("我是父线程......");
            Thread.sleep(1000);
        }
        System.out.println("父线程执行完毕");
    }
}

class MyDaemonThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("我是子线程.......守护线程");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}