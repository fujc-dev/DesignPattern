package com.zc58s.creational.abstractfactory;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/24 15:41
 */
public class FactoryHelper {
    public static CarFactory getFactory(String className) {
        try {
            Class<?> classloader = Class.forName(className);
            CarFactory factory = (CarFactory) classloader.newInstance();
            return factory;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
