package com.zc58s.builder.impl;

import com.zc58s.builder.Builder;

/*
 * @description :
 *
 * 战士
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:08
 */
public class Warrior extends Builder {
    public String buildFace() {
        return "战士脸";
    }

    public String buildClothes() {
        return "战士服饰";
    }

    public String buildHairStyle() {
        return "战士发型";
    }
}
