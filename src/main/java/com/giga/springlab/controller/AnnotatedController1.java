package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

import com.giga.spring.util.http.*;

@ControllerAnnotation
public class AnnotatedController1 {
    @UrlMapping(path="/c1/string1")
    private String methodWithAnnotation1() {
        return "String from /c1/path1";
    }

    @UrlMapping(path="/c1/string2")
    private String methodWithAnnotation2() {
        return "String from /c1/path2";
    }

    @UrlMapping(path="/c1/mav1")
    private ModelAndView methodWithAnnotation3() {
        ModelAndView mav = new ModelAndView("/pages/mav/page1.jsp");
        return mav;
    }

    @UrlMapping(path="/c1/void1")
    private void methodWithAnnotation4() {
        System.out.println("Printed from /c1/void1");
    }

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
