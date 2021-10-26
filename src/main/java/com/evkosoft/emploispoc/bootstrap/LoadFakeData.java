package com.evkosoft.emploispoc.bootstrap;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.evkosoft.emploispoc.model.Job;
import com.evkosoft.emploispoc.repository.JobRepository;
import com.github.javafaker.Faker;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoadFakeData implements CommandLineRunner {
	
	private final long MAX_JOBS = 25L;
	
	@Autowired
	private JobRepository jobRepository;

	@Override
	public void run(String... args) throws Exception {
				
		long numJobsToCreate = MAX_JOBS - jobRepository.count();
		if(numJobsToCreate > 0) {
			log.debug("==========================> Generating fake data for jobs...");
			Faker faker = new Faker(new Locale("fr-CA"));
		
			for(long i=0; i<numJobsToCreate; i++) {										
				Job job = new Job();
				job.setClosed(false);
				job.setExpiryDate(LocalDate.now().plusDays(faker.random().nextLong(30L)));
				job.setJobTitle(faker.job().title());
				job.setJobDescription(String.format("Pour le domaine de %s, nous recherchons un %s %s. Compétence recherchée : %s", 
						faker.job().field(), faker.job().seniority(), faker.job().position(), faker.job().keySkills()));
				job.setOrganizationName(faker.company().name());
				
				log.debug("{}", job.toString());
				
				jobRepository.save(job);
			}
		}
		
	}

}
