package com.zc58s.basic.io;

import java.io.*;

/*
 * DesignPattern
 * com.zc58s.basic.io
 * java.io.DataOutputStream 数据字节输出流
 * 可以将内存中的int i= 10；写入到硬盘文件中，写入的不是字符串类型，写进去的的二进制数据，并且带类型的。
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 14:45
 */
public class P196 {
    public static void main(String[] args) throws IOException {

        String filename = "temp_196";
        //数据流
        //创建数据字节输出流
        OutputStream os = new FileOutputStream(filename);
        DataOutputStream dos = new DataOutputStream(os);
        //准备数据
        byte b = 1;
        short s = 16;
        int i = 10;
        long l = 100l;
        float f = 3.14f;
        double d = 3.14;
        boolean status = false;
        char c = 'c';

        //写入流
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(status);
        dos.writeChar(c);


        //刷新，因为这是输出
        dos.flush();
        //关闭，只需要关闭最外层的流
        dos.close();


        InputStream is = new FileInputStream(filename);
        DataInputStream dis = new DataInputStream(is);
        //要使用该流读取数据，必须提前知道该流中数据的存储格式，顺序。
        //读的类型与顺序必须要与写的类型与顺序一致。
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());

        //关闭，只需要关闭最外层的流
        dis.close();

    }
}
