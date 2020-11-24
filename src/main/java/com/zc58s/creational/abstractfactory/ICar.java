package com.zc58s.creational.abstractfactory;

/*
 * 实实在在的产品，
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 14:01
 */
public  interface ICar {

    Grade createGrade();

    Nature createNature();

    VehicleModel createVehicle();

    /**
     * 显示产品信息
     */
    void display();
}
