package com.zc58s.structural.composite.demo;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 13:36
 */
public class ImageFile extends File{

    public ImageFile(String name) {
        super(name);
    }

    public void KillVirus() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }

}
