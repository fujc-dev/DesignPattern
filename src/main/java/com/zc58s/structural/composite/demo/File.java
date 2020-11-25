package com.zc58s.structural.composite.demo;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 13:34
 */
public abstract class File {

    /**
     * 文件名称，一个文件还有很多属性
     */
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void KillVirus();
}
