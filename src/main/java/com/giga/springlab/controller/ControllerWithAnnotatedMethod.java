package com.giga.springlab.controller;

import com.giga.spring.annotation.UrlMapping;

public class ControllerWithAnnotatedMethod {
    @UrlMapping(path="/url")
    private void methodWithAnnotation() {}

    @UrlMapping(path="/another-url")
    private void anotherMethodWithAnnotation() {}

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
