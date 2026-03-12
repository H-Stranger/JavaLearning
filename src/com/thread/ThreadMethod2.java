package com.thread;

//线程的礼让和join
public class ThreadMethod2 {
    public static void main(String[] args) throws InterruptedException {
        TM tm = new TM();
        Thread thread = new Thread(tm);
        thread.start();

        int cnt = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("主进程（小弟）吃包子....." + (++cnt));
            Thread.sleep(1000);
            if(i == 5){
//                System.out.println("让子进程先吃....");
//                thread.join();  //让子进程先执行完
//                System.out.println("父进程接着吃....");
                Thread.yield(); //礼让子进程
            }
        }
    }
}
class TM implements Runnable{
    private int cnt = 0;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子进程（老大）吃包子....." + (++cnt));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
