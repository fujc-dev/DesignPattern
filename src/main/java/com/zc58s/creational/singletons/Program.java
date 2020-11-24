package com.zc58s.creational.singletons;

/*
 * @description :
 * 饿汉单例：
 * 懒汉单例：
 * 懒汉模式+双重锁定：
 * 使用静态内部类实现单例模式
 * 使用枚举来实现单例
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 10:59
 */
public class Program {
    public static void main(String[] args) {
        Singleton.INSTANCE.whateverMethod();
    }
}
