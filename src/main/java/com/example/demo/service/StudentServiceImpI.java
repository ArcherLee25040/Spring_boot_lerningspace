package com.example.demo.service;

import com.example.demo.dao.Student;
import com.example.demo.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpI implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
