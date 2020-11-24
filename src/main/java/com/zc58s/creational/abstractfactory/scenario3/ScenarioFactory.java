package com.zc58s.creational.abstractfactory.scenario3;


import com.zc58s.creational.abstractfactory.Audi;
import com.zc58s.creational.abstractfactory.CarFactory;

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

    public MyBenz getBenz() {
        return new MyBenz();
    }

    public MyBMW getBMW() {
        return new MyBMW();
    }
}
