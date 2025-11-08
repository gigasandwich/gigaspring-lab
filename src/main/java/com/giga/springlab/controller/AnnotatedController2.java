package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

@ControllerAnnotation
public class AnnotatedController2 {
    @UrlMapping(path="/c2/string1")
    private String methodWithAnnotation1() {
        return "String from /c2/string1";
    }

    @UrlMapping(path="/c2/string2")
    private String methodWithAnnotation2() {
        return "String from /c2/string2";
    }

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
