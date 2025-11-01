package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

@ControllerAnnotation
public class ControllerWithAnnotatedMethod {
    @UrlMapping(path="/url")
    private void methodWithAnnotation() {}

    @UrlMapping(path="/another-url")
    private void anotherMethodWithAnnotation() {}

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
