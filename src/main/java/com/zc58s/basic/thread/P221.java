package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/22 13:59
 */
public class P221 {

    /**
     * <b><u>死锁</u></b>
     * <p>
     * 羊群效应
     * </p>
     * <p>
     *
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread(new T1(o1, o2));
        Thread t2 = new Thread(new T2(o1, o2));

        t1.start();
        t2.start();
    }

    static class T1 implements Runnable {

        Object o1;
        Object o2;

        T1(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }

        @Override
        public void run() {
            synchronized (o1) {
                System.out.println(this.getClass().getName());
                //模拟业务
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2) {

                }
            }
        }
    }

    static class T2 implements Runnable {
        Object o1;
        Object o2;

        T2(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }

        @Override
        public void run() {
            synchronized (o2) {
                System.out.println(this.getClass().getName());
                //模拟业务
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1) {

                }
            }
        }
    }
}
