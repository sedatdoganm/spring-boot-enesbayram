package com.sedatdogan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sedatdogan.entities.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
