package com.zc58s.behavior.state.simple;

/*
 * 电梯运行状态：
 * 开门(OPEN)、关闭(CLOSE)、开始升降(RUN)、停止升降(STOP)
 * 环境上下文
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:23
 */
public class Context {

    //定义出电梯的所有状态
    public final static LiftState OPENNING_STATE = new OpenningState();
    public final static LiftState CLOSING_STATE = new ClosingState();
    public final static LiftState RUNNING_STATE = new RunningState();
    public final static LiftState STOPPING_STATE = new StoppingState();

    //定义一个当前电梯状态
    private LiftState state;

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
        //通知到各个实现类中
        this.state.setContext(this);
    }

    public void open() {
        this.state.open();
    }

    public void close() {
        this.state.close();
    }

    public void run() {
        this.state.run();
    }

    public void stop() {
        this.state.stop();
    }
}