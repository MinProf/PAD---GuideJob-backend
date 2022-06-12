package com.project.GuideJob.controllers;

import com.project.GuideJob.dao.JobDao;
import com.project.GuideJob.entity.Job;
import com.project.GuideJob.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable("id") long jobId){
//        ResponseEntity<Job> matchingJob = new ResponseEntity<Job>(jobService.getJobById(jobId), HttpStatus.OK);
//        return  matchingJob;
        return jobService.getJobById(jobId);
    }
}
