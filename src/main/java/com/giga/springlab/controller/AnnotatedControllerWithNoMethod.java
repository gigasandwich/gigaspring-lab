package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;

@ControllerAnnotation
public class AnnotatedControllerWithNoMethod {
    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
