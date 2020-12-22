package com.zc58s.basic.reflection.pojo;

/*
 * DesignPattern
 * com.zc58s.basic.reflection.pojo
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/22 15:03
 */
public class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + "正在工作...");
    }

}
