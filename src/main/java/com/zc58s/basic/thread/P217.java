package com.zc58s.basic.thread;

/*
 * DesignPattern
 * com.zc58s.basic.thread
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/21 16:37
 */
public class P217 {

    /**
     * t1和t2
     * <p>
     * 异步编程模型，t1执行t1的，t2执行t2的，两个线程之间相对独立，
     * </p>
     * <p>
     * 同步编程模型：t1线程和t2线程执行，两个线程一个线程等待另一个线程执行完毕后，再执行。
     * </p>
     * <p>
     * 为什么需要使用同步？为什么要引入线程同步呢？     </p>
     * <p>1、为了数据的安全，尽管应用程序的使用率降低，但是为了保证数据的安全，必须加入线程同步机制，线程同步机制使程序好像变成了单线程；</p>
     * <p>2、什么条件下要使用线程同步？</p>
     * <p>2.1、必须是多线程环境</p>
     * <p>2.2、多线程环境下共享同一个数据</p>
     * <p>2.3、共享的数据涉及到修改</p>
     * <p>
     * synchronised 同步代码块
     * </p>
     *
     * @param args
     */
    public static void main(String[] args) {
        Account act = new Account("actno", 10000);
        //Processor processor = new Processor(act);
        Processor processor = new Processor(act);
        Thread t1 = new Thread(processor);
        Thread t2 = new Thread(processor);
        Thread t3 = new Thread(processor);
        Thread t4 = new Thread(processor);
        Thread t5 = new Thread(processor);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    /**
     * 目前代码分析：
     * 在经过测试后，打印的结果显示来看，没有把线程锁住；
     * <p>
     *     经过测试，在synchronized内部打印结果，确实的锁住了，在锁的外部打印造成的显示没有锁住。
     * </p>
     */
    static class Account {

        private static Object obj = new Object();

        private String actno;
        private double balance;


        public Account(String actno, double balance) {
            this.actno = actno;
            this.balance = balance;
        }

        public String getActno() {
            return actno;
        }

        public void setActno(String actno) {
            this.actno = actno;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        /**
         * 取款操作
         *
         * @param money
         */
        public void withdraw(double money) {
            System.out.println(this.hashCode());
            synchronized (obj) {
                double after = this.balance - money;
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                this.setBalance(after);
                System.out.println("取款1000.00成功，余额：" + this.getBalance());
            }
        }
    }

    static class Processor implements Runnable {

        Account account = null;

        public Processor(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            this.account.withdraw(1000);
        }
    }



}
