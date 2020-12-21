package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 14:40
 */
public class P213 {

    /**
     * 某线程正在休眠，如何打断线程休眠,
     * <p>
     * 需求：启动线程，5s之后，打断线程的休眠
     * </p>
     * <p>
     * 依靠异常处理机制完成。
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread t = new Thread(new Processor());
        //启动线程
        t.start();
        //主线程休眠5s
        Thread.sleep(5000);
        //终止休眠
        t.interrupt();
    }


    /**
     *
     */
    static class Processor implements Runnable {

        @Override
        public void run() {
            try {
                //该线程上时间休眠，阻塞线程
                Thread.sleep(100000000);
                //后面的代码不会被执行，Thread.sleep()方法出现异常后，被catch捕获，完毕后，继续执行外面的代码
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " ---> " + i);
            }
        }
    }
}
