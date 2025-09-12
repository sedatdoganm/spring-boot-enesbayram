package com.sedatdogan.services;

import java.util.List;

import com.sedatdogan.dto.DtoStudent;
import com.sedatdogan.dto.DtoStudentIU;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    
    public List<DtoStudent> getAllStudents();
    
	public DtoStudent getStudentById(int id);

	public void deleteStudent(int id); // Hibernate'de delete void döner çünkü sadece silme işlemi yapar, geri döndürülecek nesne yoktur.
	
	public DtoStudent updateStudent(int id, DtoStudentIU dtoStudentIU);
}
