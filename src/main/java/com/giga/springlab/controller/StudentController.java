package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.UrlMapping;
import com.giga.spring.util.http.ModelAndView;

@ControllerAnnotation
public class StudentController {
    @UrlMapping(path = "/students/")
    public ModelAndView getStudents() {
        ModelAndView mav = new ModelAndView("/pages/students/form-result.jsp");
        return mav;
    }

    @UrlMapping(path = "/students/{studentId}")
    public ModelAndView getStudent() {
        ModelAndView mav = new ModelAndView("/pages/students/form-result.jsp");
        return mav;
    }

    @UrlMapping(path = "/students/{studentId}/notes/{noteId}")
    public ModelAndView getFirstNoteOfStudent() {
        ModelAndView mav = new ModelAndView("/pages/students/form-result.jsp");
        return mav;
    }
}
