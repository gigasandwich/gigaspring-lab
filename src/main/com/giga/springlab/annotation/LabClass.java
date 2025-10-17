package com.giga.springlab.annotation;

public class LabClass {
    @UrlMapping(path="/url")
    private void methodWithAnnotation() {}

    @UrlMapping(path="/another-url")
    private void anotherMethodWithAnnotation() {}
}
