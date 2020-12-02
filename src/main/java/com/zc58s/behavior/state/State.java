package com.zc58s.behavior.state;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/2 10:15
 */
public abstract class State {
    protected Context context;

    public void setState(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
