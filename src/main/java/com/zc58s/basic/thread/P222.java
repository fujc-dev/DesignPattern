package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/22 14:09
 */
public class P222 {

    /**
     * <h2>守护线程</h2>
     * <p>也就是NET中所说的后台线程。</p>
     * 守护线程需要等用户线程结束后，守护线程结束。
     * <p>守护线程一般都是不限执行的。</p>
     *
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new Processor());
        //t1.setDaemon(true);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Processor implements Runnable {

        @Override
        public void run() {

            int i = 0;

            while (true) {
                i++;
                System.out.println(Thread.currentThread().getName() + " ---> " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
