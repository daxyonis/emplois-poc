package com.evkosoft.emploispoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evkosoft.emploispoc.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
