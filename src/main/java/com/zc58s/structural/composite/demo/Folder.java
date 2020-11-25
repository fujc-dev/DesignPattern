package com.zc58s.structural.composite.demo;

import java.util.ArrayList;
import java.util.List;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 13:35
 */
public class Folder extends File{
    private List<File> files;

    public Folder(String name){
        super(name);
        files = new ArrayList<File>();
    }

    /**
     * 浏览文件夹中的文件
     */
    public void KillVirus() {
        for(File file : files){
            file.KillVirus();
        }
    }

    /**
     * @desc 向文件夹中添加文件
     * @param file
     * @return void
     */
    public void add(File file){
        files.add(file);
    }

    /**
     * @desc 从文件夹中删除文件
     * @param file
     * @return void
     */
    public void remove(File file){
        files.remove(file);
    }
}