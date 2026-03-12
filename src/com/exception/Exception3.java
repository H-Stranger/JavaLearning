package com.exception;

public class Exception3 {
    public static void main(String[] args) {
        //异常传播
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void process1(){
        process2();
    }
    static void process2(){
        Integer.parseInt(null);  //NumberFormatException
    }
}
