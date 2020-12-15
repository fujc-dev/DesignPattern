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

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Object[] objects1 = list.toArray();
        Object[] objects2 = list.toArray();
        System.out.println("objects1 == objects2 : "+(objects1 == objects2));
        objects1[1]=4;
        System.out.println("show objects1: "+ Arrays.toString(objects1));
        System.out.println("show objects2: "+ Arrays.toString(objects2));
        System.out.println("show list: "+list);
    }
    public class A {
        private String projectId;
    }
}
