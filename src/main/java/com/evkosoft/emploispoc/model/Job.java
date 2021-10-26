package com.evkosoft.emploispoc.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

	private Long id;
	private String organizationName;
	//private String organizationDescription;
	private String jobDescription;
	//private String candidateDescription;
    private LocalDate expiryDate;    
    private Boolean closed;
}
