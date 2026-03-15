package com.exception;

public class Exc3_2 {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void process1(){
        try {
            process2();
        } catch (NullPointerException e) {
//            throw new IllegalArgumentException();
//            Throwable cause = e.getCause();
            throw new IllegalArgumentException(e);
        }
    }
    static void process2(){
        throw new NullPointerException();
    }
}
