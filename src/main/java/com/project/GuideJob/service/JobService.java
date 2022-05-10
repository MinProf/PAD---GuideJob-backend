package com.project.GuideJob.service;

import com.project.GuideJob.model.Job;

import java.util.Collection;

public interface JobService {
    Job create(Job job);
    Collection<Job> list(int limit);
    Job get(Long id);
    Job update(Job job);
    Boolean delete(Long id);
}
