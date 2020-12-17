package com.zc58s.basic.collection;

import java.util.*;

/*
 *
 * 注意：存储在MapKey部分的元素需要重写对象的equals和hashcode方法
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/17 10:57
 */
public class P167 {
    public static void main(String[] args) {

        Map persons = new HashMap(); //HashMap默认的初始容量为16，加载因子为0.75

        persons.put("10000", "Jack Ma");
        persons.put("10011", "Jack");
        persons.put("10002", "Sum");
        persons.put("10003", "Cook");
        persons.put("10004", "King");
        persons.put("10000", "Lucy");

        //
        System.out.println(persons.size());
        //
        System.out.println(persons.containsKey("10000"));
        //KEY重复会覆盖之前的Value
        System.out.println(persons.containsValue("Jack Ma"));
        //通过Key获取Value
        System.out.println(persons.get("10000"));
        //通过Key删除键值对
        persons.remove("10000");
        System.out.println(persons.size());
        Collection collection = persons.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println("===MapValue===：" + iterator.next());
        }
        //演示如何遍历Map集合
        //通过Map获取Keys
        Set keys = persons.keySet();
        Iterator iterator2 = keys.iterator();
        while (iterator2.hasNext()) {
            Object next = iterator2.next(); //Key
            Object value = persons.get(next);
            System.out.println(next + " --> " + value);
        }

        //将Map转换为Set集合，集合的类型为Entry
        Set entrySets = persons.entrySet();
        Iterator iterator3 = entrySets.iterator();
        while (iterator3.hasNext()){
            Object next = iterator3.next();
            System.out.println(next);
        }

    }

}
