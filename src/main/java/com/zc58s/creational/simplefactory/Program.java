package com.zc58s.creational.simplefactory;

/*
 * @description :
 * 引言：
 * 在程序设计里面，非常讲究层的划分和模块的划分，常见的就是分层开发，数据访问层、接口层、业务逻辑层、组件层这几块。
 * 层与层直接的通讯依赖与接口，在每一个层里面有可以划分很多小模块，每个小模块对外又是一个整体，模块对外通信也需要
 * 提供接口。那么此时对外提供的是接口，接口是协议，定义了外观，可以被多个类实现，不同的实现完成的业务逻辑不一样。
 * 设计时，使用接口的目的就是依赖倒置或者解耦，如果在使用接口时，需要通过具体的实现类是，解耦的作用就没有体现出来。
 * 简单工厂：
 * 是用来创建对象实例的，不需要关心具体是怎么实现的。
 * 案例：
 * 有一个小朋友，喜欢吃水果，但是使用刀子削皮是非常危险的事情，那么其妈妈就会在小朋友想吃水果时，给妈妈说我要吃
 * 什么什么水果，然后其妈妈就会给他削皮，然后将已削皮儿水果给小朋友。
 * 妈妈(Director)->削皮(工厂)->小朋友可直接食用的水果(Fruit)
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/23 9:19
 */
public class Program {
    public static void main(String[] args) {
        Fruit apple = PeelFactory.CreateService("Apple");
        apple.printf();
        Fruit banana = PeelFactory.CreateService("Banana");
        banana.printf();
    }
}
