package com.stzhangjk.demo.map.concurrent;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrentHashMap {
    @Test
    public void testSize(){
        Map<Integer, Integer> map = new ConcurrentHashMap<>();

        /*启动size输出定时任务*/
        new Timer("size").schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("size=" + map.size());
            }
        }, 0, 2000);

        /*启动put线程*/
        new Timer("put").schedule(new TimerTask() {
            private int data;

            @Override
            public void run() {
                data++;
                map.put(data, data);
                System.out.println("put " + data);
            }
        }, 1000, 2000);
    }

    @Test
    public void testIterator(){
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        Runnable runnable = () -> {
            try {
                while (iterator.hasNext()) {
                    Map.Entry<Integer, Integer> entry = iterator.next();
                    System.out.println(Thread.currentThread().getName() + ": " + entry.getKey() + "=" + entry.getValue());
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread a = new Thread(runnable);
        a.setName("a");
        Thread b = new Thread(runnable);
        b.setName("b");

        a.start();
        b.start();

        //输出是不确定的，因为Iterator同一时刻只能一个线程访问
    }

}
