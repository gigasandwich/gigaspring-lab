package com.giga.springlab.controller;

import com.giga.spring.annotation.controller.Controller;
import com.giga.spring.annotation.controller.*;
import com.giga.spring.annotation.http.DoGet;
import com.giga.spring.annotation.http.RequestMapping;
import com.giga.spring.util.http.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(path = "/students/")
    public ModelAndView getStudents() {
        ModelAndView mav = new ModelAndView("/pages/students/form-result.jsp");
        return mav;
    }

    @RequestMapping(path = "/students/{studentId}")
    public String studentDataWithPathVariable(@RequestParameter("actualId") int id, String name, String firstName, @PathVariable("studentId") int studentId) {
        // /students/67?actualId=12&name=Miary&firstName=Zo
        return id + " " + name + " " + firstName + " " + studentId;
    }

    @RequestMapping(path = "/students/{studentId}/notes/{noteId}")
    public void getFirstNoteOfStudent(@PathVariable("studentId") String studentId, @PathVariable("noteId") String noteId) {
        // /students/ETU001/notes/MTH101
        System.out.println("studentId: " + studentId + ", noteId: " + noteId);
    }
}
