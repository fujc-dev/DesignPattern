package com.zc58s.creational.builder.impl;

import com.zc58s.creational.builder.Builder;

/*
 * @description :
 *
 * 盗贼
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:09
 */
public class Thief extends Builder {
    public String buildFace() {
        return "盗贼脸";
    }

    public String buildClothes() {
        return "盗贼服饰";
    }

    public String buildHairStyle() {
        return "盗贼发型";
    }
}
