package com.zc58s.basic;


import java.util.ArrayList;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/16 14:52
 */
public class P158 {

    /**
     * {@link ArrayList}默认容量大小为10，扩容为1.5倍
     *
     * @param args
     */
    public static void main(String[] args) {

        int oldCapacity = 999;
        System.out.println(Integer.toBinaryString(oldCapacity));
        System.out.println(Integer.toBinaryString(oldCapacity >> 1));
        System.out.println(oldCapacity >> 1);
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);
    }
}
