package com.zc58s.creational.abstractfactory.scenario2;

import com.zc58s.creational.abstractfactory.*;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 14:22
 */
public class MyBenz extends Benz {


    public MyBenz() {
        this.brand = Brand.奔驰;
    }

    public Grade createGrade() {
        return Grade.D级;
    }

    public Nature createNature() {
        return Nature.营业客车;
    }

    public VehicleModel createVehicle() {
        return VehicleModel.三厢车型;
    }


}
