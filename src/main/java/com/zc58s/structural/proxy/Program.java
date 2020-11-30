package com.zc58s.structural.proxy;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:16
 */
public class Program {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.operation();
        System.out.println("");
    }
}
