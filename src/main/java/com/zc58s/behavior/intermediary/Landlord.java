package com.zc58s.behavior.intermediary;

/*
 * @description :
 *
 * 二房东
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 15:40
 */
public class Landlord extends Customer {

    public Landlord(Mediator mediator) {
        super(mediator);
    }

    public void receive() {
        //此时房东接收到中介
        System.out.println("房东说：房子好得很，便宜又实惠，只要998");
    }

    public void send() {
        System.out.println("房东");
        this.mediator.relay(this);
    }
}
