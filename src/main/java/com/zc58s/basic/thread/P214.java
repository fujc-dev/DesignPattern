package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 14:40
 */
public class P214 {

    /**
     * 某线程正在休眠，如何打断线程休眠,
     * <p>
     * 需求：启动线程，5s之后，终止线程
     * </p>
     * <p>
     * 依靠异常处理机制完成。
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {

        Processor processor = new Processor();
        //创建线程
        Thread t = new Thread(processor);
        //启动线程
        t.start();
        //主线程休眠5s
        Thread.sleep(5000);
        //终止线程执行
        processor.isRun = false;
        processor.doing();
    }


    /**
     *
     */
    static class Processor implements Runnable {
        /**
         * 是否运行
         */
        private Boolean isRun = true;

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                if (isRun) {
                    try {
                        //该线程上时间休眠，阻塞线程
                        Thread.sleep(1000);
                        //后面的代码不会被执行，Thread.sleep()方法出现异常后，被catch捕获，完毕后，继续执行外面的代码
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " ---> " + i);
                }
            }
        }

        private void doing() {
            System.out.println("打印测试");
        }
    }
}
