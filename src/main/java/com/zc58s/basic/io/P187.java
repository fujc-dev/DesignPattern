package com.zc58s.basic.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DesignPattern
 * com.zc58s.basic.io.readme
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/17 16:37
 */
public class P187 {
    public static void main(String[] args) throws IOException {
        String filepath = "temp02";
        File file = new File(filepath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream os = null;//  new FileOutputStream(file);

        os = new FileOutputStream(file, true);
        String msg = "Simple";
        byte[] bytes = msg.getBytes();
        //将bytes数组中的数据全部写入
        //os.write(bytes);
        //将bytes数组中的前3个byte写入
        os.write(bytes, 0, 3);
        //推荐，最后的时候，为了保证数据完全写入硬盘，需要执行刷新，当然可以不写，执行完毕后会自动刷新
        //不知道为什么推荐，老师是这么说的。

        os.flush(); //强制写入

        if (os != null) os.close();
    }
}
