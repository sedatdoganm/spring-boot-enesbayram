package com.sedatdogan.services.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = studentRepository.findById(id);
		if(!optional.isEmpty()) {
			return optional.get();
		}
		return null; 
		
	}

	@Override
	public void deleteStudent(int id) {
		Student student = getStudentById(id);
		if(student != null) {
			studentRepository.delete(student);
		}
	}

	@Override
	public Student updateStudent(int id, Student updateStudent) {
		Student dbStudent = getStudentById(id);
		if(dbStudent != null) {
			dbStudent.setFirstName(updateStudent.getFirstName());
			dbStudent.setLastName(updateStudent.getLastName());
			dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
			return studentRepository.save(dbStudent);
		}
		return null;
	}
	
}





