package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;

import com.giga.spring.util.http.*;

@ControllerAnnotation
public class AnnotatedController {
    @UrlMapping(path="/c0/string1")
    private String methodWithAnnotation1() {
        return "String from /c0/path1";
    }

    @UrlMapping(path="/c0/string2")
    private String methodWithAnnotation2() {
        return "String from /c0/path2";
    }

    @UrlMapping(path="/c0/mav1")
    private ModelAndView methodWithAnnotation3() {
        ModelAndView mav = new ModelAndView("/pages/mav/page0.jsp");

        mav.setAttribute("book", "Vinland Saga");
        mav.setAttribute("quote", "You have no enemies");
        mav.setAttribute("chapter", 160);
        mav.setAttribute("page", 8);

        return mav;
    }

    @UrlMapping(path="/c0/void1")
    private void methodWithAnnotation4() {
        System.out.println("Printed from /c0/void1");
    }

    private void methodWithoutAnnotation() {}

    private void anotherMethodWithoutAnnotation() {}
}
