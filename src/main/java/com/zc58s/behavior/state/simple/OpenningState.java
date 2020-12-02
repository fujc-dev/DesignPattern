package com.zc58s.behavior.state.simple;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:23
 */
public class OpenningState extends LiftState {

    //执行打开电梯门方法
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    //打开后还可以关闭电梯门
    @Override
    public void close() {
        //状态修改
        super.context.setState(Context.CLOSING_STATE);
        //动作委托为CLOSING_STATE执行
        super.context.getState().close();
    }

    //门开着不能运行
    @Override
    public void run() {
        //什么都不做
    }

    //门开着已经停止了
    @Override
    public void stop() {
        //什么都不做
    }

}