package com.zc58s.basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * DesignPattern
 * com.zc58s.basic.io
 * P191与P192都是对BufferedReader的使用
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 13:04
 */
public class P191 {
    public static void main(String[] args) throws IOException {

        //创建带有缓冲区的字符输入流
        /*
        FileReader fr = new FileReader("temp01");  //创建一个文件字符输入流
        BufferedReader br = new BufferedReader(fr); //将文件字符输入流包装成缓冲区字符输入流
         */
        //流可以分为：包装流和节点流，包装流又叫处理流
        //FileReader fr 是一个节点流
        //BufferedReader br 是一个包装流，又或叫处理流

        //创建带有缓冲区的输入流另一个写法，
        BufferedReader br = new BufferedReader(new FileReader("temp01"));
        String temp = null;
        while ((temp = br.readLine()) != null) {  //br.readline()方法，但是行尾不带换行符
            System.out.println(temp);
        }
        br.close();
    }
}
