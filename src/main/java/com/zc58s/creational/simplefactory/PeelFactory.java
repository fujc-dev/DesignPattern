package com.zc58s.creational.simplefactory;

/*
 * @description :
 * 削皮工厂
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/23 10:21
 */
public class PeelFactory {
    public static Fruit CreateService(String classloader) {
        if (classloader.toUpperCase().equals("APPLE")) {
            return new Apple();
        }
        if (classloader.toUpperCase().equals("BANANA")) {
            return new Banana();
        }
        return null;
    }
}
