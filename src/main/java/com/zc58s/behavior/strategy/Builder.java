package com.zc58s.behavior.strategy;

/*
 * @description :
 *
 * 构建策略类
 * 首先这个变量不是线程安全的，单线程运行没毛病，假如要优化该怎么做呢？
 * 1、锁
 * 2、给予实例
 * 静态方法是线程安全的，这个没什么说的，但是静态变量不是线程安全的。
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 14:16
 */
public class Builder {


    private static Builder builder;
    private static Ticket ticket;

    public Builder() {
        this.ticket = new Ticket();
    }


    //==================================================================================

    /**
     * 这样子实现了线程安全的问题。不管有多少个线程，{@link Ticket}都在自己的线程栈里面。
     * <p>这么写有什么意义？</p>
     * <p>这算使用外观模式吗？</p>
     * <p>这玩意儿又有一点想简单的工厂？ </p>
     * <p>懵逼了吧？</p>
     *
     * @param price
     * @param strategy
     * @return
     */
    public static Ticket builder(double price, Strategy strategy) {
        Ticket ticket = new Ticket();
        ticket.setPrice(price);
        ticket.setStrategy(strategy);
        return ticket;
    }
    //==================================================================================

    /**
     * @return
     */
    public static Builder builder() {
        return builder = new Builder();
    }

    /**
     * @param price
     * @return
     */
    public static Builder builder(double price) {
        ticket.setPrice(price);
        return builder;
    }

    /**
     * {@link Strategy}
     *
     * @param strategy
     * @return
     */
    public static Builder builder(Strategy strategy) {
        ticket.setStrategy(strategy);
        return builder;
    }

    /**
     * {@link Ticket}
     *
     * @return
     */
    public static Ticket getContext() {
        return ticket;
    }
}
