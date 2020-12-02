package com.zc58s.behavior.state.simple;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:24
 */
public class StoppingState extends LiftState {

    //停下了要开门
    @Override
    public void open() {
        super.context.setState(Context.OPENNING_STATE);
        super.context.getState().open();
    }

    //门本来就是关着的
    @Override
    public void close() {
        //什么都不做
    }

    //停止后可以再运行
    @Override
    public void run() {
        super.context.setState(Context.RUNNING_STATE);
        super.context.getState().run();
    }

    //执行停止方法
    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }

}
