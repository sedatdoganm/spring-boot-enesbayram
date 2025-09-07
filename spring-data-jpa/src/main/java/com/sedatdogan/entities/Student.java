package com.sedatdogan.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data // Data --> Getter + Setter'i otomatik olarak yukler.
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Bu sekilde her vt'a ekleme yapildiginda id articaktir.
	private int id; // primary key yaptik

	@Column(name = "first_name", nullable = false, length = 40) // nullable false: bu alan boş gecilemez demektir.
	private String firstName; // length = 40 --> Isim en fazla 40 karakter olabilir.
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
    @JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "birth_of_date", nullable = true) // burasi bos gecilebilir.
	private Date birthOfDate;
}
