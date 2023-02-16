package com.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {

	private long stId;
	private String stName;
	private double stPhone;
	private String stEmail;
	
	
	College college;//HAS-A relationship
}
