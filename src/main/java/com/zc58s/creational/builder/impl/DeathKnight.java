package com.zc58s.creational.builder.impl;

import com.zc58s.creational.builder.Builder;

/*
 * @description :
 *
 * 死亡骑士
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:09
 */
public class DeathKnight extends Builder {
    public String buildFace() {
        return "死亡骑士脸";
    }

    public String buildClothes() {
        return "死亡骑士服饰";
    }

    public String buildHairStyle() {
        return "死亡骑士发型";
    }
}
