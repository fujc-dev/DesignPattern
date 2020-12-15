package com.zc58s.basic.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/15 11:55
 */
public class Program {

    public static void main1(String[] args) {
        // 创建List数据
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //list对象通过toArray方法，返回Object[]
        Object[] objects1 = list.toArray();
        Object[] objects2 = list.toArray();
        //对比，其实objects1与objects2对比是否相等，结果显示，他们的内存地址已经发生变化
        System.out.println("objects1 == objects2 : " + (objects1 == objects2));
        //对新的objects1修改
        objects1[1] = 4;
        //打印对象，通过对比结果了解方法的特性
        System.out.println("show objects1: " + Arrays.toString(objects1));
        System.out.println("show objects2: " + Arrays.toString(objects2));
        System.out.println("show list: " + list);

    }

    public static void main(String[] args) {
        // 创建List数据
        List<People> list = new ArrayList<>();
        list.add(new People("小明"));
        list.add(new People("小王"));
        //list对象通过toArray方法，返回Object[]
        Object[] objects1 = list.toArray();
        Object[] objects2 = list.toArray();
        //对比，其实objects1与objects2对比是否相等，结果显示，他们的内存地址已经发生变化
        System.out.println("objects1 == objects2 : " + (objects1 == objects2));
        //对新的objects1修改
        ((People) objects1[1]).setName("小花");
        //打印对象，通过对比结果了解方法的特性
        System.out.println("show objects1: " + Arrays.toString(objects1));
        System.out.println("show objects2: " + Arrays.toString(objects2));
        System.out.println("show list: " + list);
        //集合中的类型如果是引用类型，那么，对不起，仅仅是对list进行了新的对象创建，而内部的值还是原来的list的值。
    }

    public static class People {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public People(String name) {
            this.name = name;
        }
    }


}
