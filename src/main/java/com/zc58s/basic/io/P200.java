package com.zc58s.basic.io;

import java.io.*;

/*
 * DesignPattern
 * com.zc58s.basic.io
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 15:34
 */
public class P200 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USER.DBF"));
        User u = new User("Lucy");
        oos.writeObject(u);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USER.DBF"));
        System.out.println(ois.readObject());
        ois.close();
    }

    static class User implements Serializable {
        String name;

        public User(String name) {
            this.name = name;
        }

        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
