package com.zc58s.behavior.strategy;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 14:13
 */
public class StudentDiscountStrategy extends Strategy {

    /**
     * 折扣
     */
    final double DISCOUNT = 0.8;
    @Override
    public double calculate(double price) {
        return price * DISCOUNT;
    }
}
