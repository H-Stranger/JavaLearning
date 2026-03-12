package com.thread.ticket;

public class ThreadTicket1 {
    public static void main(String[] args) {
        TicketSell01 ticketSell1 = new TicketSell01();
        TicketSell01 ticketSell2 = new TicketSell01();
        TicketSell01 ticketSell3 = new TicketSell01();
        ticketSell1.start();
        ticketSell2.start();
        ticketSell3.start();
        //会出现多个线程开始执行时同时判断num > 0,然后执行-1

    }
}
class TicketSell01 extends Thread{
    private static int num = 100;
    @Override
    public void run(){
        while(true){
            if(num <= 0){
                System.out.println("票卖完了");
                break;
            }
            System.out.println(Thread.currentThread().getName() + "卖出去一张票,还剩下" + (--num));
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
