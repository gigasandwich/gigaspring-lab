package com.giga.springlab.controller;

import com.giga.spring.annotation.http.DoGet;
import com.giga.spring.annotation.http.DoPost;
import com.giga.spring.util.http.ModelAndView;
import com.giga.springlab.model.Employee;
import com.giga.spring.annotation.controller.*;

@Controller
public class EmployeeController {
    @DoGet(path = "/employees")
    ModelAndView index() {
        return new ModelAndView("/pages/object-handling");
    }

    @DoPost(path = "/employees")
    String save(Employee e) {
        return e.toString();
    }
}
