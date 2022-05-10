package com.project.GuideJob.repo;

import com.project.GuideJob.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository <Job, Long>{
    Job findByIpName(String name);
}
