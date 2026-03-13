package com.thread.homework;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(bank).start();
        new Thread(bank).start();
    }
}
//每次取钱都是随机数
class Bank implements Runnable{
    private int money =  10000;
    private boolean loop = true;

    @Override
    public void run() {
        while(loop){
            int num = (int) (Math.random()*(5000 - 1000)) + 1000;
            synchronized (this){
                if(money - num < 0){
                    loop = false;
                    System.out.println("银行卡钱不够了");
                    return;
                }
            }
            money -= num;
            System.out.println(Thread.currentThread().getName() + "本次取钱：" + num + ",还剩下：" + money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
