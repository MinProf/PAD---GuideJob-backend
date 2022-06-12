package com.project.GuideJob.service;

import com.project.GuideJob.dao.JobDao;
import com.project.GuideJob.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobService {
    @Autowired
    private JobDao jobDao;


    public JobService(JobDao jobDao){
        this.jobDao = jobDao;
    }
    public List<Job> getAllJobs(){
        return jobDao.findAll().stream().collect(Collectors.toList());
    }

    public Job getJobById(long jobId){
        Optional<Job> job = jobDao.findById(jobId);
        if(job.isPresent()){
            return job.get();
        } else{
            return null;
        }
    }

    public boolean jobExists(long jobId){
        Optional<Job> job = jobDao.findById(jobId);
        if(job.isPresent()){
            return true;
        } else{
            return false;
        }
    }

    public Job addJob(Job job){
        return jobDao.save(job);
    }

    public void deleteJob(Long id){
        jobDao.deleteById(id);
    }


}
