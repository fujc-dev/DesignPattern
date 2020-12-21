package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 * 线程合并
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 16:29
 */
public class P216 {

    /**
     * 线程合并
     * {@link Thread}的成员方法join()
     * 1、
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Processor());

        t.start();
        //阻塞？还是他妈的合并？这老师讲的有毒吧？吓得我赶紧看了下文档。
        //阻塞，直到t线程执行完毕
        t.join();  //t和主线程合并，意思就是说t.join在那个线程调用，就和谁合并

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
        }
    }

    static class Processor implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " ---> " + i);
            }
        }
    }
}
