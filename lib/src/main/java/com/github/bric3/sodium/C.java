package com.github.bric3.sodium;
// Generated by jextract

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to indicate C types
 */
@Target({ ElementType.TYPE_USE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface C {
    /**
     * The C type associated with a given Java type
     * @return The C type associated with a given Java type
     */
    String value();
}
