package com.zc58s.structural.bridge.services.impl;

import com.zc58s.structural.bridge.services.AbstractColor;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/19 17:02
 */
public class GreenPencil extends Pencil {
    public GreenPencil(AbstractColor color) {
        super(color);
    }

    @Override
    public void drawing() {
        System.out.println("我使用绿色铅笔画图");
    }
}
