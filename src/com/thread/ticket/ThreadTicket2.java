package com.thread.ticket;

public class ThreadTicket2 {
    public static void main(String[] args) {
        TicketSell02 ticketSell02 = new TicketSell02();
        new Thread(ticketSell02).start();
        new Thread(ticketSell02).start();
        new Thread(ticketSell02).start();
    }
}
class TicketSell02 implements Runnable{
    private int num = 100;
    private boolean loop = true;
    public synchronized void sell(){
        if(num <= 0){
            System.out.println("票卖完了");
            //用loop为了防止一个窗口一次性卖到结束
            loop = false;
            return;
        }
        System.out.println(Thread.currentThread().getName() + "卖出去一张票,还剩下" + (--num));
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run(){
        while(loop){
            sell();
        }
    }
}
