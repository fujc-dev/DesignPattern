package com.zc58s.structural.decorator.current;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/7 15:50
 */
public interface ICache {

    Object getCache(String key);

    void putCache(String key, Object value);
}
