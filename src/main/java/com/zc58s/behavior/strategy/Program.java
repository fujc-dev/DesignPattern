package com.zc58s.behavior.strategy;

/*
 * @description :
 *
 * 案例：
 * 某软件公司为某电影院开发了一套影院售票系统，在该系统中需要为不同类型的用户提供不同的电影票打折方式，具体打折方案如下：
 *  (1) 学生凭学生证可享受票价8折优惠。
 *  (2) 年龄在10周岁及以下的儿童可享受每张票减免10元的优惠（原始票价需大于等于20元）。
 *  (3) 影院VIP用户除享受票价半价优惠外还可进行积分，积分累计到一定额度可换取电影院赠送的奖品。
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/1 14:05
 */
public class Program {
    public static void main(String[] args) {

        double originalPrice = 60.0;
        double currentPrice;
        Ticket mt = Builder.builder().builder(originalPrice).builder(new ChildrenDiscountStrategy()).getContext();
        Console.WriteLine("原始价为：" + originalPrice);
        Console.WriteLine("---------------------------------");
        Console.WriteLine("折后价为：" + mt.getPrice());
    }
}
