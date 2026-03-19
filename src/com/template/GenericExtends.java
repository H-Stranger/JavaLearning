package com.template;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        List<AA> a = new ArrayList<>();
        List<BB> b = new ArrayList<>();
        List<CC> c = new ArrayList<>();
        List<Object> o = new ArrayList<>();
        List<String> s = new ArrayList<>();
        printCollection1(a);

//        printCollection2(a);  //err
//        printCollection2(o);
//        printCollection2(s);
        printCollection2(b);
        printCollection2(c);

        printCollection3(a);
        printCollection3(b);
//        printCollection3(c);
        printCollection3(o);
//        printCollection3(s);
    }
    public static void printCollection1(List<?> c){
        for (Object o :c) {
            System.out.println(o);
        }

    }
    public static void printCollection2(List<? extends BB> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
    public static void printCollection3(List<? super BB> c){
        for (Object o :c) {
            System.out.println(o);
        }
    }
}
class AA{}
class BB extends AA{}
class CC extends BB{}
