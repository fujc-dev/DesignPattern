package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 16:25
 */
public class P215 {

    /**
     * {@link Thread}的静态方法yield
     *
     * @param args
     */
    public static void main(String[] args) {
        //让位，对同级别的线程让位
        Thread.yield();
    }
}
