package com.zc58s.behavior.state.simple;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:23
 */
public class ClosingState extends LiftState {

    //电梯门关了之后，就是升降运行
    @Override
    public void open() {

    }

    // * 执行电梯门关闭方法
    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    //电梯门关了就运行
    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        super.context.getState().run();
    }

    //电梯门关了但没有按楼层
    @Override
    public void stop() {
        super.context.setState(Context.STOPPING_STATE);
        super.context.getState().stop();
    }

}