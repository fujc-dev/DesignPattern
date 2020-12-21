package com.zc58s.basic.thread;

/*
 * JAVA多线程的基本概念
 * com.zc58s.basic.thread
 * 什么的进程？
 * 官方：正在进行的一个过程或者任务，该负责执行任务的则是CPU。
 * 案例：在单核计算机中，我们一边玩游戏，这是两个进程在计算机中运行，计算机能做到吗?。
 * 对于单核计算机来讲，在同一个时间段，两个进程是同时执行吗？
 * 不是，因为单核计算机，CPU只能点某个时间片执行一件事情。
 * 多进程的作用不是提高执行速度，而是提高CPU使用率（利用率）；
 * 进程与进程之间的内存是独立的，也就是说，创建进程会为进程分配独立的内存（操作系统会分配一块内存给进程，没有执行任何任务进程大概有4M）。
 *
 *什么是线程？
 * 每一个进程必定包含一个或者多个线程，可以理解为进程内部的独立任务。
 * 线程不是提高执行速度，而是提高应用程序的使用率
 * 线程和线程共享“堆内存和方法区内存”，栈内存是独立的，一个线程一个栈。
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/18 16:07
 */
public class P204 {

    /**
     * <p>JAVA命令会启动java虚拟机，启动JVM，等于启动了一个应用程序，表示启动了一个进程。</p>
     * <p>该进程会自动启动一个“主线程”，然后主线程会取调用某个类的main方法。</p>
     * <p>所以main方法运行的主线程当中，在此之前的所有程序都是单线程。</p>
     * <p>{@link P204}</p>
     * <p>
     * 分析以下程序有几个线程？
     * 以下程序只有一个线程，那就是主线程，
     * main，m1,m2,m3这四个方法都是在同一个栈中，没有启动任何其他线程。
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        System.out.println(Thread.currentThread().getName());
    }

}
