package com.zc58s.basic.io;

import java.io.*;

/*
 * DesignPattern
 * com.zc58s.basic.io
 * java.io.ObjectOutputStream 序列化JAVA对象到硬盘
 * java.io.ObjectInputStream 将硬盘中的数据反序列化到JVM
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 15:17
 */
public class P198 {

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //第一步：创建JAVA对象
        User user = new User("李嘉诚");
        //创建对象输出流（序列化流），将JVM中的java对象序列化到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp_198"));
        //写，序列化
        oos.writeObject(user);
        oos.flush();
        oos.close();

        //创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("temp_198"));
        //读，反序列化
        //User _ = (User) ois.readObject();
        Object o = ois.readObject();
        System.out.println(o); //User{name='李嘉诚'}
        //关闭，只需要关闭最外层的流
        ois.close();

    }


    /**
     * Serializable该接口表示可序列化的
     * <p>该接口没有任何方法，是一个标识接口</p>
     * <p>JVM如果看到该对象实现了某个标识接口，会对他进行特殊待遇</p>
     * <p>疑问：User实现Serializable接口，JVM对他的特殊待遇是什么？</p>
     * <p>
     * 会给该类添加一个属性，static final long serialVersionUID = 值, 序列化版本号
     * </p>
     * <p>
     * 序列化版本号，微了避免升级，将需要序列化的对象手动创建版本序列号
     * </p>
     */
    public static class User implements Serializable {

        //如果不想让该属性参加序列化，需要使用transient关键字进行修饰
        transient String name;

        public User(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
