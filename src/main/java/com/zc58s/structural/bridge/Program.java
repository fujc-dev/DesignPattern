package com.zc58s.structural.bridge;

import com.zc58s.structural.bridge.services.AbstractColor;
import com.zc58s.structural.bridge.services.AbstractPen;
import com.zc58s.structural.bridge.services.impl.*;

/*
 * 桥连模式：连接抽象部分与实现部分
 * 原型分析：
 * 1、比如：我们需要画图， A类是一个画类，B类是一个颜色类，A依赖B才能绘制出颜色；
 * 2、我们知道桥连是连接抽象部分与实现部分，那么我们的此时需要一个Pen类，Pen有一个drawing方法，
 * 此时Pen的依赖颜色为红色，那么drawing方法就能绘制一幅红色的图画，Pen的依赖颜色为绿色，那么drawing
 * 就能绘制一幅绿色图画，于此同时，Pen类我们可以是铅笔，圆珠笔，钢笔，毛笔等等；
 * 3、我们需要创建一个Pen的抽象类(也可以是接口)，抽象类Pen需要依赖一个颜色类，那么此时再创建一个Color的抽象类(也可以是接口)，
 * Pen类依赖于Color类，需要做的事情就的为Pen做一个构造函数的依赖；
 * 4、1) 为Pen类做派生@Pencil(铅笔);
 *    2) 为Color类做派生Green、Red(绿色、红色)
 *    3) AbstractColor color = new Red();
 *       AbstractPen pen = new Pencil(color);
 *       pen.drawing();
 *    4) 进一步细化分离，Pencil类因为需要对实现类的依赖耦合度太高，我们可以在继续将Pencil分为RedPencil、GreenPencil；
 *    5) //需求1 铅笔+红色
 *       AbstractColor color = new Red();
 *       AbstractPen pen = new RedPencil(color);
 *       pen.drawing();
 *       //需求2 铅笔+绿色
 *       color = new Green();
 *       pen = new GreenPencil(color);
 *       pen.drawing();
 *
 * 案例：
 *  星巴克咖啡厅有大杯、小杯，以及加糖与原味，此时能创建出4种不同的咖啡类别出来；
 *  大杯原味、大杯加糖、小杯原味、小杯加糖
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/19 15:21
 */
public class Program {
    public static void main(String[] args) {
        //需求1 铅笔+红色
        AbstractColor color = new Red();
        AbstractPen pen = new RedPencil(color);
        pen.drawing();
        //需求2 铅笔+绿色
        color = new Green();
        pen = new GreenPencil(color);
        pen.drawing();
    }
}
