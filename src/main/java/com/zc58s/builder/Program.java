package com.zc58s.builder;

import com.zc58s.builder.impl.DeathKnight;

/*
 * 概述：
 * 将复杂对象与它的表示分离，通俗来讲就是，将复杂的构建过程隐藏，调用者只需要关注想要的结果就行了；
 * 原型分析：
 * 1、比如我们在玩魔兽世界这种角色扮演类游戏时，有很多可选择角色，如战士(Warrior)、圣骑士(Paladin)、死亡骑士(DeathKnight)、猎人(Hunter)、盗贼(Thief)等等，
 * 如上述的角色中，每个角色的面容、服饰、发型等外部特性都有所差异。
 * 2、玩家可能是不想知道角色的构建过程，关心的是这个具体成型的角色好玩、好看等等？
 * 3、为了隐藏具体的建造过程，我们可以通过创建者模式来模拟游戏角色创建的过程；
 * 4、我们需要通过一个Director(负责人、指挥者)来输出创建好的角色，Builder角色构建者，；
 * 扩展：
 * 同样的返回一个角色，好像也可以用工厂来构建呢？当然他们之间是有显著的区别的，那么区别在哪里呢？
 * 建造者：从源码中我们看看到，建造者返回的是一个Actor对象，整个建造过程所有的Builder都是返回的同一个对象。
 * 工厂：设计工厂我们需要的是用WarriorActor、PaladinActor、DeathKnightActor、HunterActor、ThiefActor类继承自Actor类，
 * 再使用工厂构建具体的角色对象。
 * 区别：从代码结构中可以看出，一个是关注的属性，一个是产品本身的构建。
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/20 9:05
 */
public class Program {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Builder builder = new DeathKnight();
        Director director = new Director();
        Actor actor = director.GetActor(builder);
        System.out.println(actor.toString());
        actor = director.GetActor("Hunter");
        System.out.println(actor.toString());
    }
}
