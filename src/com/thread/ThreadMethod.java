package com.thread;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        for(int i = 0;i < 5;i ++){
            System.out.println("主进程运行...");
            Thread.sleep(1000);
        }
        t1.interrupt();

    }
}
class T1 extends Thread {
    @Override
    public void run() {
        while(true){
            for (int i = 0; i < 100; i++) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName() + " 吃包子~~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + " 休眠中~~~~");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //接收到中断异常
                System.out.println(Thread.currentThread().getName() + "被 interrupt了");
            }
        }
    }
}