package com.sun.javafx.collections.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(value = { java.lang.annotation.ElementType.METHOD })
@Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
public @interface ReturnsUnmodifiableCollection {

}
