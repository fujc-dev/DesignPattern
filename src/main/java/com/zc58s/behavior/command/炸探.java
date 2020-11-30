package com.zc58s.behavior.command;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:30
 */
public class 炸探 implements Command {

    private Receiver receiver;

    public 炸探(Receiver receiver) {
        this.receiver = receiver;
    }


    public void Execute() {
        this.receiver.Action();
    }
}
