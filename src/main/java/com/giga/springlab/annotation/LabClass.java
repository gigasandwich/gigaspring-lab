package com.giga.springlab.annotation;

import com.giga.spring.annotation.UrlMapping;

public class LabClass {
    @UrlMapping(path="/url")
    private void methodWithAnnotation() {}

    @UrlMapping(path="/another-url")
    private void anotherMethodWithAnnotation() {}
}
