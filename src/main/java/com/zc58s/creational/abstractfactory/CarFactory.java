package com.zc58s.creational.abstractfactory;

import com.zc58s.creational.abstractfactory.scenario1.*;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 14:42
 */
public abstract class CarFactory {

    public abstract Audi getAudi();

    public abstract Benz getBenz();

    public abstract BMW getBMW();

}
