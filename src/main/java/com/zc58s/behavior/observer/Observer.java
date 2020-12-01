package com.zc58s.behavior.observer;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 13:13
 */
public abstract class Observer {
    //观察者发起更新
    public abstract void update(Message message);
}
