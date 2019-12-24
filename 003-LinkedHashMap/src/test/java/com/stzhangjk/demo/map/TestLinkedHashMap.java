package com.stzhangjk.demo.map;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class TestLinkedHashMap {

    private static LRUCache<Integer, Integer> cache = new LRUCache<>(3);

    /**
     * 测试LRU
     */
    @Test
    public void testLRU(){
        get(7);
        print(cache);
        get(0);
        print(cache);
        get(1);
        print(cache);
        get(2);
        print(cache);
        get(0);
        print(cache);
        get(3);
        print(cache);
        get(0);
        print(cache);
        get(4);
        print(cache);
        /*以下为输出
-----
7
-----
7
0
-----
7
0
1
-----
0
1
2
-----
1
2
0
-----
2
0
3
-----
2
3
0
-----
3
0
4
         */
    }

    private static Integer get(int data){
        if (!cache.containsKey(data)){
            cache.put(data, data);
        }
        return cache.get(data);
    }

    private static void print(Map map){
        System.out.println("-----");
        Iterator i = map.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry entry = (Map.Entry) i.next();
//            System.out.println(entry.getKey() + "->" + entry.getValue());
            System.out.println(entry.getValue());
        }
    }

}
