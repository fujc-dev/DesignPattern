package com.zc58s.behavior.observer;

/*
 * @description :
 *
 * 观察者，参与者，构建一对多关系，当一个对象状态发生改变时，其相关的以依赖对象都收到消息
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 12:53
 */
public class Program {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.Attach(observer);
        //老板来了
        Message message =new Message();
        {
            message.setText("老板来了");
        }
        subject.Notify(message);

    }
}
