package com.zc58s.structural.proxy;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:17
 */
public class Proxy extends Subject {
    Subject subject ;

    public  Proxy(){
        this.subject =new RealSubject();
    }
    public void operation() {
        System.out.println("原生执行前");
        this.subject.operation();
        System.out.println("原生执行后");
    }
}
