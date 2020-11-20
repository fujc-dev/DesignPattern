package com.zc58s.bridge.services.impl;

import com.zc58s.bridge.services.AbstractColor;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/19 17:02
 */
public class RedPencil extends Pencil {
    public RedPencil(AbstractColor color) {
        super(color);
    }

    @Override
    public void drawing() {
        System.out.println("我使用红色铅笔画图");
    }
}
