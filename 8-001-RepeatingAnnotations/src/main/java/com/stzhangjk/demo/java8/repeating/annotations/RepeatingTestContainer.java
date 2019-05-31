package com.stzhangjk.demo.java8.repeating.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatingTestContainer {
    RepeatingTest[] value();
}
