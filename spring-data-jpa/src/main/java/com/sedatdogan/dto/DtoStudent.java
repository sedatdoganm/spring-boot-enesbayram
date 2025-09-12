package com.sedatdogan.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
	private String firstName;
	private String lastName;
	private Date birthOfDate;
}
