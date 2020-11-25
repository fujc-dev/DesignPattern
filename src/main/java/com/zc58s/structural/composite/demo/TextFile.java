package com.zc58s.structural.composite.demo;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 13:36
 */
public class TextFile extends File{

    public TextFile(String name) {
        super(name);
    }

    public void KillVirus() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }

}