package com.zc58s.behavior.intermediary;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 15:50
 */
public class Loser extends Customer {
    public Loser(Mediator mediator) {
        super(mediator);
    }

    public void receive() {
        //接收到中介发过来的信息，然后我根据这个结果，判断是不是要租这个房子
        System.out.println("穷小子说：特么的这价格有点儿偏贵啊");
    }

    public void send() {
        //我把我要租的房子的价格、户型之类的信息打包发给中介
        System.out.println("我是租房子的穷小子，我想组个便宜点的房子");
        this.mediator.relay(this);
    }
}
