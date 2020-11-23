package com.zc58s.structural.bridge.services;

/*
 * @description :
 *
 * 对笔的抽象
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/19 15:39
 */
public abstract class AbstractPen {
    protected AbstractColor color;


    public AbstractPen() {
        super();
    }

    /**
     * {@link AbstractPen}依赖{@link AbstractColor}，构建
     * @param color
     */
    public AbstractPen(AbstractColor color) {
        this();
        this.color = color;
    }

    public abstract void drawing();
}
