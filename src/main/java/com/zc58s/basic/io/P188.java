package com.zc58s.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DesignPattern
 * com.zc58s.basic.io
 * 文件复制
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 12:35
 */
public class P188 {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream("temp01");
        FileOutputStream os = new FileOutputStream("temp02");

        byte[] bytes = new byte[1024];
        int temp = 0;
        while ((temp = is.read(bytes)) != -1) {
            os.write(bytes, 0, temp);
        }
        //强制刷新
        os.flush();
        if (is != null) is.close();
        if (os != null) os.close();
    }
}
