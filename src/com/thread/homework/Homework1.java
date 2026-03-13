package com.thread.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1(true);
        Thread thread1 = new Thread(threadDemo1);
        ThreadDemo2 threadDemo2 = new ThreadDemo2(threadDemo1);
        Thread thread2 = new Thread(threadDemo2);
        thread1.start();
        thread2.start();
    }
}
class ThreadDemo1 implements Runnable{
    private boolean loop;

    public ThreadDemo1(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        Random random = new Random();
        while(loop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(random.nextInt(100));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
class ThreadDemo2 implements Runnable{
    private ThreadDemo1 ThreadDemo1 = null;
    private Scanner scanner = new Scanner(System.in);

    public ThreadDemo2(com.thread.homework.ThreadDemo1 threadDemo1) {
        ThreadDemo1 = threadDemo1;
    }

    @Override
    public void run() {
        System.out.println("请输入一个字符：");
        char c = scanner.next().toUpperCase().charAt(0);
        if(c == 'Q' && (ThreadDemo1!= null)) ThreadDemo1.setLoop(false);
    }
}
