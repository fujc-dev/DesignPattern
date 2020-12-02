package com.zc58s.behavior.state;

import com.zc58s.behavior.state.simple.ClosingState;
import com.zc58s.behavior.state.simple.Context;
import com.zc58s.behavior.state.simple.OpenningState;

/*
 * @description :
 *
 * 概述：
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 9:51
 */
public class Program {
    public static void main(String[] args) {
        //定义环境角色
        //Context context = new Context();
        //初始化状态
        //context.setState(new ConcreteState());
        //调用
        //context.handle();

        Context context = new Context();

        //定义初始状态为关门（共四种初始值）
        context.setState(new OpenningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
