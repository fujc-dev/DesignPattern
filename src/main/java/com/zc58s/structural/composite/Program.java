package com.zc58s.structural.composite;

import com.zc58s.structural.composite.demo.Folder;
import com.zc58s.structural.composite.demo.ImageFile;
import com.zc58s.structural.composite.demo.TextFile;
import com.zc58s.structural.composite.demo.VideoFile;
import com.zc58s.structural.composite.prototype.Component;
import com.zc58s.structural.composite.prototype.Composite;
import com.zc58s.structural.composite.prototype.Leaf;

/*
 * 概述：
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 10:42
 */
public class Program {
    public static void main(String[] args) {
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText= new TextFile("a.txt");
        ImageFile bImager = new ImageFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);

        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImageFile cImage = new ImageFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);

        //遍历C文件夹
        cFolder.KillVirus();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        cFolder.KillVirus();



        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("##############################################");
        //总公司
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        //分公司
        ConcreteCompany company = new ConcreteCompany("上海华东分公司");
        company.add(new HRDepartment("华东分公司人力资源部"));
        company.add(new FinanceDepartment("华东分公司财务部"));
        root.add(company);

        //办事处
        ConcreteCompany company1 = new ConcreteCompany("南京办事处");
        company1.add(new HRDepartment("南京办事处人力资源部"));
        company1.add(new FinanceDepartment("南京办事处财务部"));
        company.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("杭州办事处");
        company2.add(new HRDepartment("杭州办事处人力资源部"));
        company2.add(new FinanceDepartment("杭州办事处财务部"));
        company.add(company2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("\n职责：");
        root.lineOfDuty();

        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("##############################################");
        //定义多个Composite对象
        Component component = new Composite();
        Component c1 = new Composite();
        Component c2 = new Composite();
        //定义多个叶子对象
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        //组合成为树形的对象结构
        component.addChild(c1);
        component.addChild(c2);
        component.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);

        //操作Component对象
        Component o = component.getChildren(1);
        System.out.println(o);

    }

}
