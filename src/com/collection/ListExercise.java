package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for(int i = 0;i < 9;i++) list.add("hello");
        list.add(1,"hsp教育");
        System.out.println(list);
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6,"kitty");
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
