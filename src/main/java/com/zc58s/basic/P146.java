package com.zc58s.basic;

import java.util.Random;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/16 9:49
 */
public class P146 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[5];
        int index = 0;
        while (index < 5) {
            int temp = random.nextInt(6);
            if (temp != 0 && !contains(a, temp)) {
                a[index++] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static boolean contains(int[] a, int temp) {
        for (int index = 0; index < a.length; index++) {
            if (a[index] == temp) return true;
        }
        return false;
    }
}
