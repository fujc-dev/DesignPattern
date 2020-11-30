package com.zc58s.structural.facede.simple;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 11:06
 */
public class Facede {

    private static SubSystemA systemA;
    private static SubSystemB systemB;
    private static SubSystemC systemC;
    private static SubSystemD systemD;


    /**
     *
     */
    public void businessLogin() {
        if (systemA == null) systemA = new SubSystemA();
        systemA.println();
        if (systemB == null) systemB = new SubSystemB();
        systemB.println();
    }


}
