package com.stzhangjk.demo.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 利用LinkedHashMap实现LRU缓存
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V>{

    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    /**
     * 注意不做删除操作，删除操作在put等操作完成了
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
