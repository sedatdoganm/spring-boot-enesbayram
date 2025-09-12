package com.sedatdogan.controller;

import java.util.List;

import com.sedatdogan.dto.DtoStudent;
import com.sedatdogan.dto.DtoStudentIU;

public interface IStudentController {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getAllStudents();
    public DtoStudent getStudentById(int id);
    public void deleteStudent(int id);
    public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU);
}
