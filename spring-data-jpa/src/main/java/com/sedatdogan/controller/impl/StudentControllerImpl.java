package com.sedatdogan.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sedatdogan.controller.IStudentController;
import com.sedatdogan.entities.Student;
import com.sedatdogan.services.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @Override
	@GetMapping("/all")
	public List<Student> getAllStudents(){
    	return studentService.getAllStudents();
    }

	@Override
	@GetMapping("/all/{id}")
	public Student getStudentById(@PathVariable (name = "id")int id) {
		return studentService.getStudentById(id);
	}

	@Override
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable(name = "id") int id) {
	    studentService.deleteStudent(id);
	}

	@Override
	@PutMapping("/update/{id}")
	public Student updateStudent(
	        @PathVariable(name = "id") int id,
	        @RequestBody Student updateStudent) {
	    
	    return studentService.updateStudent(id, updateStudent);
	}
}
