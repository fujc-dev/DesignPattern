package com.zc58s.creational.abstractfactory;

import com.zc58s.creational.abstractfactory.scenario1.ScenarioFactory;

/*
 * 引言：
 * 在开发中，我们需要使用日志记录运行构成，操作记录，以及异常，此时我们有控制台日志，文件日志，数据库日志
 * 三种供我们在不同的情况使用，控制台只需要显示，文件日志，需要构建文件存储的路径，数据库日志需要连接远程数据库的
 * 服务器名称和密码等，下面就用简单工厂、工厂方法、抽象工厂分别来构建。
 * 1、简单工厂：
 * Log -> writeLog(String content)
 * ConsoleLog -> 直接打印日志，直接显示在控制台上
 * FileLog -> 此时，需要一个存储路径
 * DatabaseLog -> 此时，需要连接输入服务器地址与密码，数据库名称
 * LogFactory -> 在你需要时候取你想要的存储日志方式即可。
 *
 * ConsoleLog、FileLog、DatabaseLog都派生自Log，此时LogFactory内部做了构建ConsoleLog、FileLog、DatabaseLog，
 *
 * CloudLog -> SDK包之类的东西
 * 只有一个工厂，所有的活儿都由这个工厂干了，一般是可以满足需求的，如果现在我们需要增加一个日志存储到云平台的怎么？
 * 此时我们要做的就是创建一个CloudLog类，然后派生自Log，然后再去LogFactory编写判断。创建出现问题，整个创建都不能使用。
 *
 * 面对一些比较简单的对象创建，可以使用。
 * 2、工厂方法：
 * 与简单工厂的区别就是，一个具体的产品包含一个具体的工厂，所有的事情不在一个工厂搞定。
 *
 * Log
 * Factory
 * ConsoleLog:Log => ConsoleLogFactory:Factory
 * FileLog:Log => FileLogFactory:Factory
 * DatabaseLog:Log => DatabaseLogFactory:Factory
 *
 * 简单工厂违背开闭原则，工厂方法虽然满足开闭原则，但是再产品太多的时候，类会膨胀，不利于维护。
 * 例如：车->
 *  按品牌：奔驰、宝马、奥迪；
 *  按等级：A级（包括A0/A00）车是指小轿车，B级车是指中档轿车，C级车是高档轿车，D级车是指豪华轿车；
 *  按性质：家庭自用汽车、非营业客车、营业客车、非营业货车;
 *  按车型：小型车、微型车、紧凑车型、中等车型、高级车型、豪华车型、三厢车型、CDV车型、MPV车型、SUV等车型;
 *  按座位：5座、8座、35座、47座等；
 *  假如此时获取产品（车），但是车的构造如此复杂，要构建一辆车，需要为车添加等级、性质、车型、座位数，那么此时如果
 *  用简单工厂和工厂方法来为用户返回一个车辆该怎么做呢？
 *  产品：
 *  1、奔驰+A级+小型车+5座这是一个产品
 *  2、奔驰+C级+高级车型+SUV+5座是一个产品
 * 简单工厂：会将产品1封装为P1，产品2封装为P2，通过一个产品工厂返回给用户。
 * 工厂方法：同上，唯一不同的点是工厂方法符合设计原则，开闭原则。
 * 3、抽象工厂
 *  假如用户需要车，我们可以为用户产出不同的车，维护一系列的方案，一个工厂表示一个方案，然后得到最终的产品。
 *  理解抽象工厂，需要理解产品族，什么是产品族？
 *  这个产品族要站在用户的角度去分析：用户想要的是一个什么性质的轿车、品牌是什么、车型是什么、什么等级的车；
 *      1） 奔驰、家庭自用汽车、小型车、5座  产品1方案
 *      2） 奥迪、家庭自用汽车、小型车、5座  产品2方案
 * *    2） 宝马、家庭自用汽车、小型车、5座  产品2方案
 *  本例代码按照品牌分族：
 *  抽象工厂的代码是来创建具体的产品的。抽象方法类型构建的是车的性质、等级、车型、座位。
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 10:59
 */
public class Program {

    public static void main(String[] args) {
//        CarFactory factory = new ScenarioFactory();
//        factory.getAudi().display();
//        factory.getBenz().display();
//        factory.getBMW().display();
//        System.out.println("----------------------------------");
//
//        factory = new com.zc58s.creational.abstractfactory.scenario2.ScenarioFactory();
//        factory.getAudi().display();
//        factory.getBenz().display();
//        factory.getBMW().display();
//        System.out.println("----------------------------------");
//
//        factory = new com.zc58s.creational.abstractfactory.scenario3.ScenarioFactory();
//        factory.getAudi().display();
//        factory.getBenz().display();
//        factory.getBMW().display();

        //抽象工厂 + 简单工厂 混合使用
        CarFactory factory = FactoryHelper.getFactory("com.zc58s.creational.abstractfactory.scenario2.ScenarioFactory");
        factory.getAudi().display();
        factory.getBenz().display();
        factory.getBMW().display();
    }
}
