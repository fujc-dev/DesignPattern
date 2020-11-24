package com.zc58s.creational.abstractfactory.scenario1;

import com.zc58s.creational.abstractfactory.*;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 14:41
 */
public class ScenarioFactory extends CarFactory {


    public Audi getAudi() {
        return new MyAudi();
    }

    public Benz getBenz() {
        return new MyBenz();
    }

    public BMW getBMW() {
        return new MyBMW();
    }
}
