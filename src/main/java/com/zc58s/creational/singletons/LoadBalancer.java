package com.zc58s.creational.singletons;

/*
 * @description :
 *
 * 懒汉+双重锁定
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 16:03
 */
public class LoadBalancer {

    private static LoadBalancer instance = null;
    //程序运行时创建一个静态只读的辅助对象

    private LoadBalancer() {
    }

    /**
     * synchronized 可以将该关键字放置再方法种，也可以实现线程安全
     *
     * @return
     */
    public static LoadBalancer GetInstance() {
        //第一重判断，先判断实例是否存在，不存在再加锁处理
        if (instance == null) {
            //加锁的程序在某一时刻只允许一个线程访问
            synchronized (LoadBalancer.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LoadBalancer();  //创建单例实例
                }
            }
        }
        return instance;
    }
}
