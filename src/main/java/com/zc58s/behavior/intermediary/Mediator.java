package com.zc58s.behavior.intermediary;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 15:40
 */
public abstract class Mediator {

    /**
     * 注册参与者
     *
     * @param customer
     */
    abstract void register(Customer customer);

    /**
     * 通知中介者，发送消息
     * @param colleague
     */
    public abstract void relay(Customer colleague);
}
