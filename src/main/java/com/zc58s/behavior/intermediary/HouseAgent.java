package com.zc58s.behavior.intermediary;

import java.util.ArrayList;
import java.util.List;

/*
 * @description :
 *
 * 房屋经纪人
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 15:40
 */
public class HouseAgent extends Mediator {

    List<Customer> containers = new ArrayList<>();

    void register(Customer customer) {
        //这儿就是用户再中介来登记
        if (!containers.contains(customer)) {
            this.containers.add(customer);
        }
    }

    public void relay(Customer colleague) {
        //中介收到了用户的租房诉求，根据诉求准备了一批意向结果，然后发送给用户
        containers.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive();
            }
        });
    }
}
