package com.stzhangjk.demo.java8.repeating.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(RepeatingTestContainer.class)
public @interface RepeatingTest {
    String value() default "RepeatingTest";
}
