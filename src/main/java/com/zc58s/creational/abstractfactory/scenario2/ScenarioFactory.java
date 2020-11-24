package com.zc58s.creational.abstractfactory.scenario2;


import com.zc58s.creational.abstractfactory.Audi;
import com.zc58s.creational.abstractfactory.BMW;
import com.zc58s.creational.abstractfactory.Benz;
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

    public Benz getBenz() {
        return new MyBenz();
    }

    public BMW getBMW() {
        return new MyBMW();
    }
}
