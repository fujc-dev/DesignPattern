package com.zc58s.creational.factorymethod.椰子壳纽扣;

import com.zc58s.creational.factorymethod.Factory;
import com.zc58s.creational.factorymethod.平面珠光纽扣.平面珠光纽扣;
import com.zc58s.creational.factorymethod.纽扣;

import java.awt.*;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 10:18
 */
public class 椰子壳纽扣Factory extends Factory {
    public 纽扣 createProduct() {
        纽扣 _ = new 椰子壳纽扣();
        _.setColor(Color.GREEN);
        _.setMaterial("椰子壳");
        return _;
    }
}
