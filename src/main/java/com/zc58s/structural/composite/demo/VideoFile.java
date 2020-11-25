package com.zc58s.structural.composite.demo;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 13:36
 */
public class VideoFile extends File{

    public VideoFile(String name) {
        super(name);
    }

    public void KillVirus() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}
