package com.zc58s.structural.decorator;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 17:06
 */
public class Program {
    public static void main(String[] args) {
        VisualComponent component, componentSB, componentBB; //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        componentBB.display();

        //1、执行的是最外层的装饰的setDecorator
        //2、执行装饰的display
        //3、再装饰的display里面的setDecorator
        //4、直到最外层的组件
    }
}
