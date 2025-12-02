package com.giga.springlab.controller;

import com.giga.spring.annotation.controller.Controller;
import com.giga.spring.annotation.http.*;
import com.giga.spring.annotation.controller.*;

import java.util.Map;

@Controller
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
    String showAllCourses(@PathVariable("courseId") String courseId, Map<String, Object> map) {
        // /courses/1?name=miary&firstName=zo
        String fullName = (String) map.get("name") + " " +  (String)  map.get("firstName");
        return courseId + "; " + fullName;
    }
}