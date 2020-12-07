package com.zc58s.structural.decorator.current;

import java.util.HashMap;
import java.util.Map;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/7 15:54
 */
public class RedisDecorator extends Decorator {
    private Map<String, Object> containers = new HashMap<>();

    public RedisDecorator(ICache cache) {
        super(cache);
    }


    @Override
    public Object getCache(String key) {
        System.out.println(">>>>>>>>>>>>调用二级缓存查询！");
        if (containers.containsKey(key)) {
            return containers.get(key);
        }
        Object value = this.cache.getCache(key);
        if (value != null)
            this.putCache(key, value);
        return value;
    }

    @Override
    public void putCache(String key, Object value) {
        containers.put(key, value);
    }
}
