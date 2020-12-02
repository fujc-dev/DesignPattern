package com.zc58s.behavior.state;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:19
 */
public class ConcreteState extends State {
    @Override
    public void handle() {
        System.out.println("ConcreteState 的 handle 方法");
    }
}
