package com.zc58s.behavior.strategy;

/*
 * @description :
 *
 * 儿童票策略
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 14:13
 */
public class ChildrenDiscountStrategy extends Strategy {

    /**
     * 折扣
     */
    final double DISCOUNT = 0.2;

    @Override
    public double calculate(double price) {
        return price * DISCOUNT;
    }
}
