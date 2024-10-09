package com.example.demo.converter;

import com.example.demo.dao.Student;
import com.example.demo.dto.StudentDto;

public class StudentConverter {
    public static StudentDto convertStudent(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(studentDto.getName());
        studentDto.setEmail(studentDto.getEmail());
        return studentDto;
    }
}
