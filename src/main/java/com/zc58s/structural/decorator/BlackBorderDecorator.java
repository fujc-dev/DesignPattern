package com.zc58s.structural.decorator;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 17:06
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void setDecorator() {
        System.out.println("为构件增加黑色边框！");
    }

}
