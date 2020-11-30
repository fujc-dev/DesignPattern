package com.zc58s.structural.proxy;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:16
 */
public class RealSubject extends Subject {
    public void operation() {
        System.out.println("原生的调用结果");
    }
}
