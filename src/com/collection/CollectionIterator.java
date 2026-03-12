//package com.collection;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//public class CollectionIterator {
//    public static void main(String[] args) {
//        Collection col = new ArrayList();
//        col.add(new Book("三国演义", "罗贯中", 10.1));
//        col.add(new Book("小李飞刀", "古龙", 5.1));
//        col.add(new Book("红楼梦", "曹雪芹", 34.6));
//        //迭代器使用
//        Iterator iterator = col.iterator();
//        while(iterator.hasNext()){
//            Object next = iterator.next();//返回的是Book类型
//            //编译是Object类型   运行是Book类型
//            System.out.println(next);
//        }
//        //快捷键 itit
//        //Ctrl + j  查看快捷键
//        //循环结束，Iterator为null，需要再次遍历，需重置
//        //for( : )结构本质也是迭代器
//        //I和foreach快速使用
//
//    }
//}
//
//class Book {
//    // 1. 定义属性
//    private String name;
//    private String author;
//    private double price;
//
//    // 2. 构造器（用于创建对象时赋值）
//    public Book(String name, String author, double price) {
//        this.name = name;
//        this.author = author;
//        this.price = price;
//    }
//
//    // 3. 【核心】重写 toString() 方法
//    // 按照图片格式：Book{name='三国演义', author='罗贯中', price=10.1}
//    @Override
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}
