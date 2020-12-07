package com.zc58s.structural.decorator;

import com.zc58s.structural.decorator.current.*;
import com.zc58s.structural.decorator.simple.BlackBorderDecorator;
import com.zc58s.structural.decorator.simple.ScrollBarDecorator;
import com.zc58s.structural.decorator.simple.VisualComponent;
import com.zc58s.structural.decorator.simple.Window;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 17:06
 */
public class Program {
    public static void main(String[] args) {
//        VisualComponent component, componentSB, componentBB; //使用抽象构件定义
//        component = new Window(); //定义具体构件
//        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
//        componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
//        componentBB.display();

        //1、执行的是最外层的装饰的setDecorator
        //2、执行装饰的display
        //3、再装饰的display里面的setDecorator
        //4、直到最外层的组件


        //
        //原始的功能
        ICache cache = new MemoryCache();
        //装饰功能RedisDecorator
        RedisDecorator decorator = new RedisDecorator(cache);
        //装饰功能SimpleDecorator
        SimpleDecorator simpleDecorator = new SimpleDecorator(decorator);
        //decorator.setMemoryCache(cache);
        Object value = simpleDecorator.getCache("zhangsan");

        System.out.println(value);
        value = simpleDecorator.getCache("zhangsan");
        System.out.println(value);

    }
}
