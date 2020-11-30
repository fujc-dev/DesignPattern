package com.zc58s.behavior.intermediary;

import com.zc58s.behavior.intermediary.demo.*;

/*
 * @description :
 * 概述：
 * 中介，这个词太太太太广泛了，房屋中介、公司代办、婚姻介绍所等等，https://baike.baidu.com/item/中介服务/2519363；
 * 为什么会出现中介，以房屋中介为例，在没有中介的情况下，我要租房，我面临的将是信息采集，然后找到那些人的房屋需要出租，
 * 我需要与房东沟通，确认房源，查看位置，房屋年限之类的，然后从这些信息中匹配出符合我条件的房屋，这个过程想想都可怕。
 * 步骤：
 * 1、一家一家的找需要被出租的住房；
 * 2、确认房屋大小、户型、采光、朝向、年限；
 * 3、匹配是不是自己想要的；
 * 假如是再大都市，这种事情想想都不可思议，只怕永远都租不到吧，此时我就需要一个中介者，我只需要告诉中介我的需求，中介反馈
 * 给我满意的结果，完美。
 *
 *
 * 观察者与中介者的区别，业务看起来很相似，其实区别很大：
 * 观察者模式:；
 * 中介者模式:我把房子挂在链家，房子涨跌链家会通知潜在买家。
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 15:19
 */
public class Program {

    public static void main(String[] args) {
        //构建中介
        Mediator mediator = new HouseAgent();
        //构建一个租房者
        Customer loser = new Loser(mediator);
        //登记
        mediator.register(loser);
        //构建一个二房东
        Customer landlord = new Landlord(mediator);
        //登记
        mediator.register(landlord);
        //告诉中介，我要租房
        loser.send();
        landlord.send();


        Console.WriteLine("一个租客看房：");
        ///初始化中介
        HouseMediator mediator1 = new HouseMediator();

        ///初始化房屋信息
        SmallHouseColleague smallHouseColleague = new SmallHouseColleague( );
        TwoHouseColleague twoHouseColleague = new TwoHouseColleague( );
        ThreeHouseColleague threeHouseColleague = new ThreeHouseColleague( );

        ///中介获取房屋信息
        mediator1.SetSmallHouse(smallHouseColleague);
        mediator1.SetTwoHouse(twoHouseColleague);
        mediator1.SetThreeHouse(threeHouseColleague);

        ///租户A需要两居室、提供看房
        mediator1.Common("两居室");

        //租户B需要四居室、暂无房源
        mediator1.Common("四居室");


    }
}
