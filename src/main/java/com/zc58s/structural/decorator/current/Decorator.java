package com.zc58s.structural.decorator.current;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/7 15:53
 */
public abstract class Decorator implements ICache {

    protected ICache cache;

    public Decorator(ICache cache) {
        this.cache = cache;
    }

}
