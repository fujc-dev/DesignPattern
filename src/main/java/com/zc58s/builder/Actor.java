package com.zc58s.builder;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:13
 */
public class Actor {
    /**
     * 面容
     */
    private String face;
    /**
     * 服饰
     */
    private String clothes;
    /**
     * 发型
     */
    private String hairStyle;

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "face='" + face + '\'' +
                ", clothes='" + clothes + '\'' +
                ", hairStyle='" + hairStyle + '\'' +
                '}';
    }
}
