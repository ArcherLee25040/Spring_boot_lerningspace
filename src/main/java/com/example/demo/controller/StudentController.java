package com.example.demo.controller;

import com.example.demo.Response;
import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDto> getStudentById(@PathVariable long id) {
        return Response.newSuccess(studentService.getStudentById(id));
    }
}
