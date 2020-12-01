package com.zc58s.behavior.observer;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 13:15
 */
public class ConcreteSubject extends Subject {
    @Override
    public void Attach(Observer observer) {
        super.observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        super.observers.remove(observer);
    }

    @Override
    public void Notify(Message message) {
        System.out.println(message);
        super.observers.forEach(x -> {
            x.update(message);
        });
    }
}
