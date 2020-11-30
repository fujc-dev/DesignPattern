package com.zc58s.structural.flyweight;

/*
 * @description :
 *
 * 概述：
 * 对象的共享，不需要重新实例化对象，直接将之前分配好的对象拿来用就是了。
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 11:32
 */
public class Program {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        System.out.println(System.identityHashCode(fly));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        System.out.println(System.identityHashCode(fly));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        System.out.println(System.identityHashCode(fly));
        fly.operation("Third Call");
    }
}
