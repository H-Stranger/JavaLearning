package com.thread;
//线程生命周期
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        TS ts = new TS();
        Thread thread = new Thread(ts);
        System.out.println("子线程的状态：" + thread.getState());
        thread.start();
        //查看状态
        while(Thread.State.TERMINATED != thread.getState()){
            System.out.println("子线程的状态：" + thread.getState());
            Thread.sleep(500);
        }
        System.out.println("子线程的状态：" + thread.getState());
    }
}
class TS implements Runnable{
    private int cnt = 0;
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println("子进程吃包子....." + (++cnt));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
