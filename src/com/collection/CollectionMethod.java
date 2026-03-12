package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        // 1. add：添加单个元素
        list.add("你好");
        list.add(10);
        list.add(true);
        System.out.println(list);
        // 2. remove：删除指定元素
        list.remove(0);
        list.remove(true);
        System.out.println(list);
        // 3. contains：判断元素是否存在
        System.out.println(list.contains(10));
        // 4. size：获取集合元素个数
        System.out.println(list.size());
        // 5. isEmpty：判断集合是否为空
        System.out.println(list.isEmpty());
        // 6. clear：清空集合所有元素
        list.clear();
        System.out.println(list);
        // 7. addAll：添加多个元素（传入另一个Collection）
        list.add("tom");
        List list2 = new ArrayList();
        list2.add("kitty1");
        list2.add("kitty2");
        list2.add("kitty3");
        list.addAll(list2);
        System.out.println(list);
        // 8. containsAll：判断是否包含另一个集合的所有元素
        list2.add("bobo");
        System.out.println(list2);
        System.out.println(list.containsAll(list2));
        // 9. removeAll：删除集合中包含的另一个集合的所有元素
        list.removeAll(list2);
        System.out.println(list);
        // 10. 说明：以ArrayList为例演示Collection接口的常用方法

    }
}
