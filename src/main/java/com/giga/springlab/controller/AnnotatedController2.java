package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

@ControllerAnnotation
public class AnnotatedController2 {
    @UrlMapping(path="/c2/path1")
    private String methodWithAnnotation1() {
        return "String from /c2/path1";
    }

    @UrlMapping(path="/c2/path2")
    private String methodWithAnnotation2() {
        return "String from /c2/path1";
    }

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
