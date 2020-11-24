package com.zc58s.creational.abstractfactory;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 15:30
 */
public abstract class Car implements ICar {
    protected Brand brand;

    public void display() {
        Grade grade = this.createGrade();
        Nature nature = this.createNature();
        VehicleModel vehicleModel = this.createVehicle();
        System.out.println("#######################################");
        System.out.println("#[品牌]:" + this.brand.name() + "");
        System.out.println("#[等级]:" + grade.name() + "");
        System.out.println("#[性质]:" + nature.name() + "");
        System.out.println("#[车型]:" + vehicleModel.name() + "");
        System.out.println("#######################################");
    }
}
