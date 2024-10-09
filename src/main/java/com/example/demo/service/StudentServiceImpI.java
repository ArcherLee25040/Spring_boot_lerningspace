package com.example.demo.service;

import com.example.demo.converter.StudentConverter;
import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpI implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDto getStudentById(long id) {
        Student student = studentRepository.findById(id).orElseThrow(RuntimeException::new);
//        StudentConverter.converStudent(student);
//        StudentConverter.convertStudent(student);
        return StudentConverter.convertStudent(student);

    }
}
