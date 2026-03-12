package com.exception;

public class Exc3_test {
    public static void main(String[] args) {
        try {
            System.out.println(tax(2000, 0.1));
            System.out.println(tax(-200, 0.1));
            System.out.println(tax(2000, -0.1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static double tax(int salary, double rate) {
        if(salary < 0 || rate <0) throw new IllegalArgumentException();
        // TODO: 如果传入的参数为负，则抛出IllegalArgumentException
        return salary * rate;
    }
}
