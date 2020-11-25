package com.zc58s.structural.decorator;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 17:05
 */
public abstract class ComponentDecorator extends VisualComponent {

    private VisualComponent component;

    public ComponentDecorator(VisualComponent component) {
        this.component = component;
    }

    public void display() {
        this.setDecorator();
        this.component.display();
    }

    public abstract void setDecorator();


}
