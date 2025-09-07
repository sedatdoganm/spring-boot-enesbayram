package com.sedatdogan.controller;

import java.util.List;

import com.sedatdogan.entities.Student;

public interface IStudentController {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(int id);
    public void deleteStudent(int id);
    public Student updateStudent(int id, Student updateStudent);
}
