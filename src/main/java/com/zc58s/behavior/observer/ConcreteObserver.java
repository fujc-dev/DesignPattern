package com.zc58s.behavior.observer;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 13:15
 */
public class ConcreteObserver extends Observer {
    @Override
    public void update(Message message) {
        System.out.println("我需要做的事情就是把我玩的游戏的界面关闭");
    }
}
