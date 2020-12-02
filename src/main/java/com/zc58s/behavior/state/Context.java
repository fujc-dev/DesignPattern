package com.zc58s.behavior.state;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:15
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setState(this);
    }

    public void handle() {
        this.state.handle();
    }
}
