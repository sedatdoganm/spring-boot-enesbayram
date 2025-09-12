package com.sedatdogan.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sedatdogan.dto.DtoStudent;
import com.sedatdogan.dto.DtoStudentIU;
import com.sedatdogan.entities.Student;
import com.sedatdogan.repository.StudentRepository;
import com.sedatdogan.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
    	Student student = new Student();
    	DtoStudent response = new DtoStudent();
    	
    	BeanUtils.copyProperties(dtoStudentIU, student);
    	
    	student = studentRepository.save(student);
    	BeanUtils.copyProperties(student, response);
    	return response;
    	
    }

    @Override
    public List <DtoStudent> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        List<DtoStudent> dtoStudentList = new ArrayList<>();

        for (Student student : studentList) {
            DtoStudent dto = new DtoStudent(); // döngü içinde yeni obje
            BeanUtils.copyProperties(student, dto); // doğru yön
            dtoStudentList.add(dto);
        }
        return dtoStudentList;
    }


	@Override
	public DtoStudent getStudentById(int id) {
		DtoStudent dto = new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if(!optional.isEmpty()) {
			Student dbStudent = optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
		}
		return dto; 
		
	}

	@Override
	public void deleteStudent(int id) {
		 
		Optional <Student> optional = studentRepository.findById(id);
		if(optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
		
	}

	@Override
	public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto = new DtoStudent()
;		Optional<Student> optional = studentRepository.findById(id);
		 if(optional.isPresent()) {
			 Student dbStudent = optional.get();
			 dbStudent.setFirstName(dtoStudentIU.getFirstName());
			 dbStudent.setLastName(dtoStudentIU.getLastName());
			 
			 Student updatedStudent = studentRepository.save(dbStudent);
			 BeanUtils.copyProperties(updatedStudent, dto);
			 return dto;
		 }
		 return null;
	}

	
	
	
}





