package com.zc58s.creational.factorymethod;

import java.awt.*;

/*
 * @description :
 *
 * 基础的纽扣父类，有一些纽扣的属性
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 9:07
 */
public abstract class 纽扣 {

    /**
     * 颜色
     */
    private Color color;
    /**
     * 材料名称
     */
    private String material;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    /**
     * 纽扣的材质
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "纽扣{" +
                "color=" + color +
                ", material='" + material + '\'' +
                '}';
    }
}
