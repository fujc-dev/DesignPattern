package com.zc58s.basic.collection;

import java.util.*;

/*
 * {@link P170}
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/17 13:37
 */
public class P170 {
    public static void main(String[] args) {
        List ls = new ArrayList();
        ls.add(10);
        ls.add(5);
        ls.add(20);
        ls.add(99);
        ls.add(30);

        /**
         *         for (int i = 0; i < ls.size(); i++) {
         *             System.out.println("ls ---> " + ls.get(i));
         *         }
         */


        /**
         *
         *         for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
         *             System.out.println(iterator.next());
         *         }
         */

        Iterator iterator = ls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=========================================");

        Collections.sort(ls);

        iterator = ls.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Set是无序不可重复集合
        Set sets = new HashSet();
        sets.add(100);
        sets.add(30);
        sets.add(6);
        sets.add(12);
        sets.add(9);

        List setList = new ArrayList(sets);
        Collections.sort(setList);
        setList.forEach((u) -> {
            System.out.println(u);
        });

        Collections.synchronizedList(setList);

    }
}
