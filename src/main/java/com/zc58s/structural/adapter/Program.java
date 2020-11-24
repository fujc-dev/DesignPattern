package com.zc58s.structural.adapter;

/*
 * @description :
 * 概述：
 * 让不兼容的设备能正常运行。
 * 手机充电器不能直接使用我们的220V的家用电，通过一个转接适配器，可以让手机充电。
 * 笔记本电脑20V - 生活用电220V
 *
 * 软件开发：
 * 存在不兼容的结构，例如方法名不一致，引入适配器模式
 * 新接口与老接口参数不一致
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 16:48
 */
public class Program {

    public static void main(String[] args) {
        Target target = new Adapter();
        User user = target.handleReq();
        System.out.println( user.toString());;
    }

}
