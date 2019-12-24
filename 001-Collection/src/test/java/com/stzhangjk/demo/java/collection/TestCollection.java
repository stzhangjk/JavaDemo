package com.stzhangjk.demo.java.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCollection {
    @Test
    public void testStreamAPI(){
        Collection<Person> c = new ArrayList<>(3);
        c.add(new Person("A"));
        c.add(new Person("A"));
        c.add(new Person("B"));

        Set<Person> set = c.stream().collect(Collectors.toSet());
        System.out.println(set.getClass().getName());  //java.util.HashSet
    }
}
