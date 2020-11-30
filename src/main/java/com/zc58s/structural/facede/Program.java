package com.zc58s.structural.facede;

import com.zc58s.structural.facede.simple.*;

/*
 * @description :
 * 概述：
 * 面对日益复杂的系统变更以及软件子系统的越来越多，用户对系统的访问也就变得越来越复杂，
 * 现在微服务特别火，每一个微服务封装的部署一个独立的服务，服务有自己的业务逻辑，开发者
 * 只需要调用服务方法就行了。
 * 通俗来讲，就是将需要多个子系统、或者类配合处理的业务，将这些子系统或者类前置到公共的类中，
 * 后续只需要调用这个公共的类就可以完成相同的事情。
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/27 13:06
 */
public class Program {
    public static void main(String[] args) {
        //常规对接
        System.out.println("===============与子系统常规对接begin===============");
        SubSystemA systemA = new SubSystemA();
        systemA.println();
        SubSystemB systemB =new SubSystemB();
        systemB.println();
        SubSystemC systemC =new SubSystemC();
        systemC.println();
        SubSystemD systemD =new SubSystemD();
        systemD.println();
        System.out.println("===============与子系统常规对接end===============");


        System.out.println("===============与子系统Facede对接begin===============");
        Facede facede = new Facede();
        facede.businessLogin();

        EncryptFacade  encryptFacade = new EncryptFacade();
        encryptFacade.FileEncrypt();
        System.out.println("===============与子系统Facede对接end===============");

    }
}
