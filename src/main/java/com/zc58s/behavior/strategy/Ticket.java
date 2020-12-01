package com.zc58s.behavior.strategy;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 14:12
 */
public class Ticket {
    private double price;
    private Strategy strategy;





    public void setPrice(double price) {
        this.price = price;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public double getPrice() {
        return this.strategy.calculate(this.price);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
