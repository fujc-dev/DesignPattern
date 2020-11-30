package com.zc58s.structural.flyweight;

/*
 * @description :
 *
 * 享元接口，通过这个接口传入外部状态并作用于外部状态；
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 11:50
 */
public abstract class Flyweight {
    public abstract void operation(String state);
}
