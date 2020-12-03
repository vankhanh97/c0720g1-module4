package com.example.blog_app.entity;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = OkValidator.class)
@Documented
public @interface Ok {
    String message() default "Invalid content";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


