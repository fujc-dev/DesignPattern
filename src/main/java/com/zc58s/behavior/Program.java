package com.zc58s.behavior;

/*
 * @description :
 *
 * 概述：
 * 行为，就是做了什么事情，造就了什么结果，我们称之为行为。
 * 什么是行为模式：将行为抽象，实现对象的解耦，这描述好对所有的行为型模式都说得通；
 * 命令：将请求者与实现者解耦，将具体的行为封装为一个一个的命令，由调用者按需调用；
 * 本例，使用安防实例阐述命令，假如我们有如下三个振动光纤、液探、炸探的探测设备，当
 * 弹出结果触发后，需要响应一个指定的结果。
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:29
 */
public class Program {
    public static void main(String[] args) {
        //当液探触发
        Receiver receiver = new 液探Receiver();
        Command command = new 液探(receiver);
        Invoker invoker = new Invoker(command);
        invoker.Execute();
        //振动光纤
        receiver = new 振动光纤Receiver();
        command = new 振动光纤(receiver);
        invoker = new Invoker(command);
        invoker.Execute();
        //炸探
        receiver = new 炸探Receiver();
        command = new 炸探(receiver);
        invoker = new Invoker(command);
        invoker.Execute();

    }
}
