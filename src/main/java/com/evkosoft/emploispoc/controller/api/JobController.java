package com.evkosoft.emploispoc.controller.api;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evkosoft.emploispoc.model.Job;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/job")
public class JobController {
		

	@GetMapping({"","/"})
	public List<Job> findAll() {
		return Arrays.asList(
				new Job(1L,"MegaCorp Inc.", "Développeur(se) web", "Lorem ipsum this is the job description blah blah blah", LocalDate.now().plus(7, ChronoUnit.DAYS),false),
				new Job(2L,"Tiny Startup", "Conseiller(ère) en RH", "Lorem ipsum this is the job description blah blah blah", LocalDate.now().plus(14, ChronoUnit.DAYS),false),
				new Job(3L,"Walmart", "Caissier(ère)", "Lorem ipsum this is the job description blah blah blah", LocalDate.now().plus(11, ChronoUnit.DAYS),false),
				new Job(4L,"Usine ABC", "Contremaître-électricien", "Lorem ipsum this is the job description blah blah blah", LocalDate.now().plus(10, ChronoUnit.DAYS),false),
				new Job(5L,"Firme XYZ", "Avocat(e) spécialisé(e) en agroalimentaire", "Lorem ipsum this is the job description blah blah blah", LocalDate.now().plus(12, ChronoUnit.DAYS),false));
	}
}
