package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 14:13
 */
public class P212 {
    /**
     * Thread.sleep() 休眠，详解
     * <p>1、Thread.sleep(毫秒)</p>
     * <p>2、sleep方法是一个静态方法
     * <p>3、该方法的作用：阻塞当前线程，腾出CPU时间片让给其他线程，
     *
     * <p>description</p>
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Processor();
        t.start();

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
            Thread.sleep(1000);
        }
         */


        t.sleep(5000);  //JAVA里面的静态方法可以使用对象实例调用，意义与类名.方法名一致

    }

    static class Processor extends Thread {

        /**
         * Thread的中固定run方法不抛出异常，重写run方法后，再run方法声明的位置上不能使用throw
         * 所以，run方法的异常只能使用try...catch...
         */
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " ---> " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 伪代码
     *
     *
     *
     */
}
