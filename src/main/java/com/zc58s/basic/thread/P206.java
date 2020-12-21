package com.zc58s.basic.thread;

/*
 * JAVA 线程运行原理
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 10:50
 */
public class P206 {

    /**
     * 在JAVA语言中，实现多线程的第一种方式：
     * <p>
     * 1、继承{@link Thread}类
     * </p>
     * <p>
     * 2、重写run方法
     * </p>
     * <p>
     * 三个知识点：
     * <p>1、如何定义线程？</p>
     * <p>2、如果创建线程？</p>
     * <p>3、如果使用线程？</p>
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建线程
        Thread t = new Processor();
        //启动
        //告诉java虚拟机再分配一个新的栈给t线程；
        //run方法不需要程序员手动执行，系统线程启动之后会自动调用run方法。
        t.start();

        t.run();    //这是普通方法调用，不会创建线程。

        for (int i = 0; i < 10; i++) {
            System.out.println("main ---> " + i + Thread.currentThread().getName());
        }
        //有了多线程之后，main方法中只是主线程中没有方法栈帧；
        //但是其他线程或者其他栈中还有帧；
        //main方法结束，程序可能还在运行。
    }

    public static class Processor extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("run ---> " + i + Thread.currentThread().getName());
            }
        }
    }
}
