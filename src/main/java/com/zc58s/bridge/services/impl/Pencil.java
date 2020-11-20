package com.zc58s.bridge.services.impl;

import com.zc58s.bridge.services.AbstractColor;
import com.zc58s.bridge.services.AbstractPen;

/*
 * 铅笔画笔
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/19 15:46
 */
public class Pencil extends AbstractPen {


    public Pencil(AbstractColor color) {
        super(color);
    }

    /**
     * 假如此处不好控制，我们还可以再增加以颜色为基础的派生
     * 如：红色铅笔{@link RedPencil}、绿色铅笔{@link GreenPencil}
     */
    public void drawing() {
        System.out.println("铅笔绘制" + super.color.getColor() + "图画");
    }
}
