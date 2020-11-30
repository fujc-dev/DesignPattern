package com.zc58s.behavior.command;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/30 13:29
 */
public class Invoker implements Command {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void Execute() {
        this.command.Execute();
    }
}
