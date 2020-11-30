package com.zc58s.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * @description :
 *
 * 享元工厂，主要用来创建并管理共享的享元对象，并对外提供访问共享享元的接口；
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 11:50
 */
public class FlyweightFactory {
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();

    public Flyweight factory(Character state){
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }
}
