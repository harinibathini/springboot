package com.springboot.sms.controller;

import com.springboot.sms.service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


}
