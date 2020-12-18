package com.zc58s.basic.io;

import java.io.*;

/*
 * DesignPattern
 * com.zc58s.basic.io
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 13:33
 */
public class P193 {
    public static void main(String[] args) throws IOException {
        //创建带有缓冲区的字符输入流
        /*
        FileWriter fw = new FileWriter("temp04");
        BufferedWriter bw = new BufferedWriter(fw);
        */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("temp04", true)));
        bw.write("我是一个.NET程序员");
        bw.newLine();
        bw.write("学习JAVA无数次，没有做过JAVA项目，啥也不是！");
        bw.newLine();
        bw.flush(); //强制刷新
        bw.close(); //只需要关闭最外层的流
    }
}
