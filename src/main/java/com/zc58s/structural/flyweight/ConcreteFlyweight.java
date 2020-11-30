package com.zc58s.structural.flyweight;

/*
 * @description :
 *
 * 具体的享元实现对象，必须是可共享的，需要封装享元对象的内部状态；
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 11:50
 */
public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;
    /**
     * 构造函数，内蕴状态作为参数传入
     * @param state
     */
    public ConcreteFlyweight(Character state){
        this.intrinsicState = state;
    }


    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String state) {
        // TODO Auto-generated method stub
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);
    }
}
