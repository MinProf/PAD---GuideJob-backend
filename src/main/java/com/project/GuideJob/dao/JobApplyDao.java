package com.project.GuideJob.dao;

import com.project.GuideJob.entity.Job;
import com.project.GuideJob.entity.JobApply;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface JobApplyDao extends CrudRepository<JobApply, Long> {

    @Query("select u from JobApply u where u.userId = ?1 and u.jobId = ?2")
    JobApply findByUseridAndJobid(Long userId, Long jobId);
}
