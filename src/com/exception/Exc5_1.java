package com.exception;

public class Exc5_1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.address.city.toLowerCase());
    }
}
class Person{
    String[] name = new String[12];
    Address address = new Address();
}
class Address{
    String city;
    String province;
    String street;
}
