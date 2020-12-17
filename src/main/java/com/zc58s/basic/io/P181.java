package com.zc58s.basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * java.io.InputStream;
 * java.io.FileInputStream;
 * 文件字节输入流
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/17 15:06
 */
public class P181 {
    public static void main(String[] args) {
        FileInputStream is = null;
        try {
            //要读取文件，需要创建一个"输入流"，这个输入流就是文件的流
            //String filepath = "E:\\MyProjects\\DesignPattern\\src\\main\\java\\com\\zc58s\\basic\\io\\temp01";
            String filepath = "E:/MyProjects/DesignPattern/src/main/java/com/zc58s/basic/io/temp01";
            is = new FileInputStream(filepath);
            int i1 = is.read();  //以字节的方式读取
            //如果已经读取到文件见的末尾就会返回-1
            System.out.println(i1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //为了保证流的关闭，在finally里进行对流的释放
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
