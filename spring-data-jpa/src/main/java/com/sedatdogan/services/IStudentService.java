package com.sedatdogan.services;

import java.util.List;

import com.sedatdogan.entities.Student;

public interface IStudentService {
    public Student saveStudent(Student student);
    
    public List<Student> getAllStudents();
    
	public Student getStudentById(int id);

	public void deleteStudent(int id); // Hibernate'de delete void döner çünkü sadece silme işlemi yapar, geri döndürülecek nesne yoktur.
	
	public Student updateStudent(int id, Student updateStudent);
}
