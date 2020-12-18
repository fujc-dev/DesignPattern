package com.zc58s.basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * DesignPattern
 * com.zc58s.basic.io
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/17 15:30
 */
public class P182 {
    public static void main(String[] args) throws IOException {
        String filepath = "E:/MyProjects/DesignPattern/src/main/java/com/zc58s/basic/io/temp01";
        FileInputStream is = new FileInputStream(filepath);
        //  while (true) {
        //      int temp = is.read();
        //      if (temp == -1) break;
        //      System.out.println(temp);
        //  }

        //  int temp = 0;
        //  while ((temp = is.read()) != -1) {
        //      System.out.println(temp);
        //  }
        //is.read() 频繁访问磁盘，并且是每读一次返回一个字节的方式读取，访问效率低下
        /*
        byte[] buffer = new byte[3];  //每次最多读三个字节
        int temp1 = is.read(buffer);
        System.out.println(new String(buffer));
        int temp2 = is.read(buffer);
        System.out.println(new String(buffer));
        int temp3 = is.read(buffer);
        System.out.println(new String(buffer, 0, temp3));
        int temp4 = is.read(buffer);
        //is.read(byte[] bytes); 该方法返回的int值，表示当前读取的字节数
        System.out.println("===================");
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);

        */


        /*
        byte[] bytes = new byte[1024];
        while (true) {
            int temp = is.read(bytes);
            if (temp == -1) break;
            System.out.println(new String(bytes, 0, temp));
            System.out.println("===================");
        }
        */

        //升级循环
        byte[] bytes = new byte[1024];
        int temp = 0;
        while ((temp = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, temp));
            System.out.println("===================");
        }

        if (is != null) is.close();
    }
}
