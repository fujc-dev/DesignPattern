package com.zc58s.structural.adapter;

/*
 * @description :
 *
 * 适配器
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 17:17
 */
public class Adapter extends Adaptee implements Target {

    public User handleReq() {
        User user = new User();
        user.setName(super.request());
        return user;
    }
}
