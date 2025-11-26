package com.giga.springlab.controller;

import com.giga.spring.annotation.ControllerAnnotation;
import com.giga.spring.annotation.http.*;
import com.giga.spring.annotation.controller.*;

@ControllerAnnotation
public class CourseController {
    @DoGet(path = "/courses")
    String showAllCourses() {
        return "GET /courses";
    }

    @DoPost(path = "/courses")
    String insertCourse() {
        return "POST /courses";
    }

    @DoGet(path = "/courses/{courseId}")
    String showAllCourses(@PathVariable("courseId") String courseId) {
        return courseId;
    }
}