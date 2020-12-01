package com.zc58s.behavior.strategy;

/*
 * @description :
 *
 * 构建策略
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 14:16
 */


public class Builder {


    private static Ticket ticket;
    private static Builder builder;

    public Builder() {
        this.ticket = new Ticket();
    }

    public static Builder builder() {
        return builder = new Builder();

    }

    public static Builder builder(double price) {
        ticket.setPrice(price);
        return builder;
    }

    public static Builder builder(Strategy strategy) {
        ticket.setStrategy(strategy);
        return builder;
    }

    public static Ticket getContext() {
        return ticket;
    }

}
