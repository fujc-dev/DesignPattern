package com.zc58s.creational.factorymethod;

import com.zc58s.creational.factorymethod.纽扣;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 9:09
 */
public abstract class Factory {

    /**
     * 创建具体的产品
     *
     * @return
     */
    public abstract 纽扣 createProduct();
}
