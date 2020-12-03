package com.example.blog_app.entity;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OkValidator implements ConstraintValidator<Ok, String> {
    public void initialize(Ok constraint) {
    }

    public boolean isValid(String obj, ConstraintValidatorContext context) {
        return obj.matches("^[0-9]{4}");

    }
}
