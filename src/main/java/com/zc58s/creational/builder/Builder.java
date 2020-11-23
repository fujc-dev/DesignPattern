package com.zc58s.creational.builder;

/*
 * 建造者，这玩意儿会建造面容、服饰、发型等，那么在这个抽象类{@link Builder}中，
 * 我们应该创建3个方法，声明构建面容、服饰、发型的方法。
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:02
 */
public abstract class Builder {

    /**
     * {@link Builder}是一个建造者抽象，该方法用于构建面容
     */
    public abstract String buildFace();

    /**
     * {@link Builder}是一个建造者抽象，该方法用于构建服饰
     */
    public abstract String buildClothes();

    /**
     * {@link Builder}是一个建造者抽象，该方法用于构建发型
     */
    public abstract String buildHairStyle();

    /**
     * 创建并返回具体的校色
     *
     * @return
     */
    public Actor createActor() {
        Actor actor = new Actor();
        actor.setFace(this.buildFace());
        actor.setClothes(this.buildClothes());
        actor.setHairStyle(this.buildHairStyle());
        return actor;
    }

}
