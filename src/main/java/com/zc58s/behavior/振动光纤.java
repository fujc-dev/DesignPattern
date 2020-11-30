package com.zc58s.behavior;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:32
 */
public class 振动光纤 implements Command {
    private Receiver receiver;

    public 振动光纤(Receiver receiver) {
        this.receiver = receiver;
    }

    public void Execute() {
       this.receiver.Action();
    }
}
