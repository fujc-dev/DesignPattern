package com.zc58s.basic.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * DesignPattern
 * com.zc58s.basic.io
 * P191与P192都是对BufferedReader的使用
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 13:14
 */
public class P192 {
    public static void main(String[] args) throws Exception {
        //创建带有缓冲区的字符输入流
        /*
        //文件输入字节流
        FileInputStream fis = new FileInputStream("temp01");
        //转换流
        InputStreamReader isr = new InputStreamReader(fis);
        //包装流、处理流
        BufferedReader br = new BufferedReader(isr);

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("temp01")));

        String temp = null;
        while ((temp = br.readLine()) != null) {  //br.readline()方法，但是行尾不带换行符
            System.out.println(temp);
        }
        br.close();  //看源码知道，br.close时，reader也被自己关闭了
    }
}
