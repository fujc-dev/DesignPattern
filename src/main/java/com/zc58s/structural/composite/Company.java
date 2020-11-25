package com.zc58s.structural.composite;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 14:37
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void lineOfDuty();
}
