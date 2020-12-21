package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 11:05
 */
public class P207 {

    /**
     * JAVA中实现线程的第二种方式：
     * <p>
     * 1、写一个类实现{@link Runnable}接口
     * </p>
     * <p>
     * 2、实现run方法
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {

        Thread t = new Thread(new Processor());
        t.start();


    }

    /**
     * 这种方式的推进的，因为一个类实现接口之外，还保留了类的继承。
     */
    public static class Processor implements Runnable {

        @Override
        public void run() {

        }
    }
}
