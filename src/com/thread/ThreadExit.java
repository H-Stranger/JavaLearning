package com.thread;

public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        new Thread(t).start();

        System.out.println("主线程休眠10s");
        Thread.sleep(10 * 1000);
        t.setLoop(false);
    }
}
class T implements Runnable{
    private int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(1000);
                System.out.println("运行中...." + (++count));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //通知退出思路
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
