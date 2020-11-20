package com.zc58s.builder;

/*
 * 指挥者，这各对象就是用来对外输出
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 10:02
 */
public class Director {

    /**
     * 省去了具体的建造过程，直接对外输出结果
     *
     * @param builder
     * @return
     */
    public Actor GetActor(Builder builder) {
        return builder.createActor();
    }

    /**
     * @param roleName
     * @return
     */
    public <T extends Builder> Actor GetActor(String roleName) {
        Class<?> classloader = null;
        Builder builder = null;
        try {
            classloader = Class.forName("com.zc58s.builder.impl." + roleName);
            builder = (T) classloader.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this.GetActor(builder);
    }
}
