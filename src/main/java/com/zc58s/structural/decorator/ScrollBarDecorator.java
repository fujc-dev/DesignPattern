package com.zc58s.structural.decorator;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 17:05
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(VisualComponent component) {
        super(component);
    }


    @Override
    public void setDecorator() {
        System.out.println("为构件增加滚动条！");
    }
}
