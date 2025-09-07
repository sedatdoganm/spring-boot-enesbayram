package com.sedatdogan.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sedatdogan.entities.Student;
import com.sedatdogan.repository.StudentRepository;
import com.sedatdogan.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student); 
    }
}

