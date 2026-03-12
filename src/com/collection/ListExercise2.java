package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise2 {
    public static void main(String[] args) {
        // 1. 创建集合存储Book对象
        List books = new ArrayList<>();
        // 2. 添加数据（对应图片中的4本书）
        books.add(new Book("红楼梦", 100.0, "曹雪芹"));
        books.add(new Book("西游记", 10.0, "吴承恩"));
        books.add(new Book("水浒传", 19.0, "施耐庵"));
        books.add(new Book("三国", 80.0, "罗贯中"));
        // 3. 遍历输出（和图片格式一致）
        for (Object o : books) {
            System.out.println(o);
        }

        for(int i = 0;i < books.size()-1;i++){
            for(int j = 0;j < books.size() - i - 1;j++){
                Book o1 = (Book) books.get(j);
                Book o2 = (Book) books.get(j+1);
                if(o1.getPrice() > o2.getPrice()){
                    books.set(j,o2);
                    books.set(j+1,o1);
                }
            }
        }
        System.out.println("================");
        for (Object o : books) {
            System.out.println(o);
        }

    }
}

class Book {
    // 成员变量
    private String name;
    private double price;
    private String author;

    // 构造器（用于创建对象时赋值）
    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    // Getter方法（用于获取属性值）
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    // 重写toString()，按图片格式输出
    @Override
    public String toString() {
        return String.format("名称：%s\t价格：%.1f\t作者：%s", name, price, author);
    }
}
