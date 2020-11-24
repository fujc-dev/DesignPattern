package com.zc58s.creational.factorymethod;

import com.zc58s.creational.factorymethod.*;
import com.zc58s.creational.factorymethod.云花仿贝纽扣.*;

/*
 * @description :
 *
 * 概述：
 * 首先在熟悉简单工厂前提下分析工厂方法，抽象工厂与简单工厂他们之间存在一定的关联，
 * 最重要的一点是工厂方法为了创建实例需要多个工厂实现。工厂方式主要的对工厂的进一步
 * 深入，然后满足业务需求。
 * 案例分析：在日常生活中，以我们的纽扣为例，我们见过的纽扣各式各样，如：真贝纽扣，椰子壳纽扣，
 * 木材纽扣，石质纽扣，金属纽扣，云花仿贝纽扣，玻璃珠光纽扣，平面珠光纽扣等，假如某一个公司，
 * 生产上述的各种纽扣，那么我们想象一下，每一个纽扣都是需要一个机器才能生产出来。
 * 所以依次需要，真贝纽扣Factory，椰子壳纽扣Factory，木材纽扣Factory，石质纽扣Factory，
 * 金属纽扣Factory，云花仿贝纽扣Factory，玻璃珠光纽扣Factory，平面珠光纽扣Factory。
 * 从工厂方法的结构来看，大概总结如下：
 * 抽象产品 -> 具体的产品
 * 抽象的工厂 -> 具体的工厂
 * 使用：
 * 可能纽扣的案例优点不切实际，但是在日常开发中，我们用的日志可能更贴合实际一点，比如我们有控制台日志，
 * 文本日志，数据库日志等等，不同日志不同的实现方式，每一个日志对应一个日志工厂，我们只需要配置日志工厂，
 * 就可以使用具体的存储日志类型。
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 8:56
 */
public class Program {

    public static void main(String[] args) {
        Factory factory = new 云花仿贝纽扣Factory();
        纽扣 _= factory.createProduct();
        System.out.println(_.toString());
    }
}
