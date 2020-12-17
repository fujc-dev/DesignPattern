package com.zc58s.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/*
 * 哈希表又叫散列表，哈希表底层是一个数组，数组内部是一个单向链表，每一个单向链表都有一个hashCode，
 * 这个hashCode可以看做是数组的下标。
 *
 * 数组：有索引有值
 * 单项链表：值，下一个值的地址
 * 向哈希表中写入【put(object key,object value)】，该方法做了那些事情？
 *   得到key的hashcode，在数组中看一下，有没有相同的hashcode，如果有？将将value写入改数组对应的单项链表中，
 * 如果没有，向数组的尾部追加，并将value写入单项链表中？
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/16 16:26
 */
public class P161 {
    public static void main(String[] args) {
        HashSet<User> sets = new HashSet<>();


        User u1 = new User(1, "张三");
        User u2 = new User(2, "张三");
        sets.add(u1);
        sets.add(u2);

        Iterator<User> iterator = sets.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user);
        }
    }

    static class User {
        private int no;
        private String username;


        public User(int no, String username) {
            this.no = no;
            this.username = username;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getUsername() {
            return username;
        }


        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return getNo() == user.getNo() && Objects.equals(getUsername(), user.getUsername());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNo(), getUsername());
        }

        @Override
        public String toString() {
            return "User{" +
                    "no=" + no +
                    ", username='" + username + '\'' +
                    '}';
        }
    }
}
