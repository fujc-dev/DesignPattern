package com.zc58s.behavior.intermediary;

/*
 * @description :
 *
 * 客户类，所有想租房子的人
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 15:40
 */
public abstract class Customer {

    protected Mediator mediator;

    public Customer(Mediator mediator) {
        this.mediator = mediator;
    }
    //接收到中介发的信息
    public abstract void receive();
    //我发给中介的信息
    public abstract void send();

}
