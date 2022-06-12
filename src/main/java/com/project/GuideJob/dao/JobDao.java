package com.project.GuideJob.dao;

import com.project.GuideJob.entity.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobDao extends CrudRepository<Job, Long> {

    Optional<Job> findById(Long id);
    List<Job> findAll();

}
