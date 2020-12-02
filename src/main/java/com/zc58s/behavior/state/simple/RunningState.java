package com.zc58s.behavior.state.simple;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:23
 */
public class RunningState extends LiftState {

    //运行时不能开门
    @Override
    public void open() {
        //什么都不做
    }

    //运行时门肯定是关的
    @Override
    public void close() {
        //什么都不做
    }

    // * 执行运行方法
    @Override
    public void run() {
        System.out.println("电梯运行中");
    }

    //运行后可以停止
    @Override
    public void stop() {
        //环境设置为停止状态
        super.context.setState(Context.STOPPING_STATE);
        super.context.getState().stop();
    }

}