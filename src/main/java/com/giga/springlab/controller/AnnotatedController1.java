package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

@ControllerAnnotation
public class AnnotatedController1 {
    @UrlMapping(path="/c1/path1")
    private void methodWithAnnotation1() {

    }

    @UrlMapping(path="/c1/path2")
    private void methodWithAnnotation2() {
        
    }

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
