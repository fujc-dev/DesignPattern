package com.zc58s.creational.abstractfactory.scenario3;

import com.zc58s.creational.abstractfactory.*;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 14:22
 */
public class MyAudi extends Audi {

    public MyAudi() {
        this.brand = Brand.奥迪;
    }

    public Grade createGrade() {
        return Grade.B级;
    }

    public Nature createNature() {
        return Nature.家庭自用汽车;
    }

    public VehicleModel createVehicle() {
        return VehicleModel.微型车;
    }




}
