package com.evkosoft.emploispoc.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evkosoft.emploispoc.model.Job;
import com.evkosoft.emploispoc.repository.JobRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/job")
public class JobController {
		
	@Autowired
	private JobRepository jobRepository;

	@GetMapping({"","/"})
	public List<Job> findAll() {
		Page<Job> page = jobRepository.findAll(PageRequest.ofSize(12));
		return page.getContent();
	}
}
