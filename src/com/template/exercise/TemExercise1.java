package com.template.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TemExercise1 {
    public static void main(String[] args) {
        // 直接合并创建 3 个员工对象（一步到位）
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom", 8000, new MyDate(10, 15, 1995)));
        employees.add(new Employee("Tom", 12000, new MyDate(5, 20, 1998)));
        employees.add(new Employee("Tom", 10000, new MyDate(3, 8, 1995)));
        System.out.println(employees);
        //list.sort(比较器)
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不匹配");
                    return 0;
                }
                //比较name
                int res = o1.getName().compareTo(o2.getName());
                if(res != 0) return res;
                //比较出生年份
                res = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if(res != 0) return res;
                //比较出生月
                res = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(res != 0) return res;
                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        });
        System.out.println(employees);
    }
}

