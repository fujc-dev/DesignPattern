package com.zc58s.behavior.command;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:31
 */
public class 液探 implements Command {

    private Receiver receiver;

    public 液探(Receiver receiver) {
        this.receiver = receiver;
    }

    public void Execute() {
        receiver.Action();
    }
}
