package com.zc58s.structural.decorator.current;

import java.util.HashMap;
import java.util.Map;

/*
 *
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/12/7 15:52
 */
public class MemoryCache implements ICache {
    private Map<String, Object> containers = new HashMap<>();

    public MemoryCache() {
        containers.put("zhangsan", "牛逼");
    }

    @Override
    public Object getCache(String key) {
        System.out.println(">>>>>>>>>>>>调用一级缓存查询！");
        return containers.get(key);
    }

    @Override
    public void putCache(String key, Object value) {
        containers.put(key, value);
    }
}
