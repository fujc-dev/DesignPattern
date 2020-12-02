package com.zc58s.behavior.state.simple;

/*
 * 状态基类，此处需要定义的是业务包含的所有状态的行为
 * 目前电梯我们定义的行为：
 * 开门
 * 关门
 * 运行
 * 停止
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:23
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯门开启动作
    public abstract void open();

    //电梯门关闭动作
    public abstract void close();

    //电梯运行
    public abstract void run();

    //电梯停止
    public abstract void stop();

}
