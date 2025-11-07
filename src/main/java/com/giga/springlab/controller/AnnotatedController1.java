package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

@ControllerAnnotation
public class AnnotatedController1 {
    @UrlMapping(path="/c1/path1")
    private String methodWithAnnotation1() {
        return "String from /c1/path1";
    }

    @UrlMapping(path="/c1/path2")
    private String methodWithAnnotation2() {
        return "String from /c1/path2";
    }

    @UrlMapping(path="/c1/path3")
    private void methodWithAnnotation3() {
        System.out.println("Printed from /c1/path3");
    }

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
