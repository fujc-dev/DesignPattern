package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 * JAVA采用抢占式模型
 * 线程优先级高的，获取的CPU时间片相对多一些，当然也就影响了执行的先后顺序。
 * 优先级：1-10，最高10，最低1，默认5
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 11:47
 */
public class P210 {

    /**
     * 关于线程的优先级
     * <p>
     * 1、获取当前线程对象Thread.currentThread();
     * 2、自定义线程名称 t.setName("")
     * 3、获取线程名称 t.getName();
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new Processor("t1");
        Thread t2 = new Processor("t2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(5);
        t1.setPriority(6);
        t1.start();
        t2.start();
    }

    static class Processor extends Thread {
        public Processor(String name) {
            super.setName(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " ---> " + i);
            }
        }
    }
}
