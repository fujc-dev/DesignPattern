package com.zc58s.behavior.intermediary.demo;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 16:34
 */
public class HouseMediator extends Mediator {

    /// <summary>
    /// 中介有所有房东的房屋信息
    /// </summary>
    private SmallHouseColleague SmallHouse;
    private TwoHouseColleague TwoHouse;
    private ThreeHouseColleague ThreeHouse;

    public void SetSmallHouse(SmallHouseColleague small) {
        SmallHouse = small;
    }

    public void SetTwoHouse(TwoHouseColleague two) {
        TwoHouse = two;
    }

    public void SetThreeHouse(ThreeHouseColleague three) {
        ThreeHouse = three;
    }

    /// <summary>
    ///
    /// </summary>
    /// <param name="colleague"></param>
    @Override
    public void Common(String type) {
        switch (type) {
            case "单间":
                SmallHouse.Handle();
                Console.WriteLine("如果可以就可以租房了!");
                break;
            case "两居室":
                TwoHouse.Handle();
                Console.WriteLine("如果可以就可以租房了!");
                break;
            case "三居室":
                ThreeHouse.Handle();
                Console.WriteLine("如果可以就可以租房了!");
                break;
            default:
                Console.WriteLine(type + "暂时没有房源!");
                break;
        }
    }
}
