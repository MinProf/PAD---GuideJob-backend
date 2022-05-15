package com.project.GuideJob.service.implementation;

import com.project.GuideJob.model.Job;
import com.project.GuideJob.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service(value = "jobService")
public class JobServiceImplementation implements JobService {
    @Override
    public Job create(Job job) {
        return null;
    }

    @Override
    public Collection<Job> list(int limit) {
        return null;
    }

    @Override
    public Job get(Long id) {
        return null;
    }

    @Override
    public Job update(Job job) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
