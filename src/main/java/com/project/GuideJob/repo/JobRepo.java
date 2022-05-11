package com.project.GuideJob.repo;

import com.project.GuideJob.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface JobRepo extends JpaRepository<Job, Long> {
    Optional<Job> findById(Long id);
}
