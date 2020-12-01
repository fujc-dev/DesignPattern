package com.zc58s.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 13:12
 */
public abstract class Subject {

    //定义一个观察者集合用于存储所有观察者对象
    protected List<Observer> observers = new ArrayList<>();

    //声明抽象注册方法，用于向观察者集合中增加一个观察者
    public abstract void Attach(Observer observer);

    //声明抽象注销方法，用于在观察者集合中删除一个观察者
    public abstract void Detach(Observer observer);

    //声明抽象通知方法
    public abstract void Notify(Message message);


}
