package com.zc58s.creational.builder.impl;

import com.zc58s.creational.builder.Builder;

/*
 * @description :
 *
 * 猎人
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:09
 */
public class Hunter extends Builder {

    public String buildFace() {
        return "猎人脸";
    }

    public String buildClothes() {
        return "猎人服饰";
    }

    public String buildHairStyle() {
        return "猎人发型";
    }
}
