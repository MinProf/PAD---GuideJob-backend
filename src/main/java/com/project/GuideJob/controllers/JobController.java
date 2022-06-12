package com.project.GuideJob.controllers;

import com.project.GuideJob.dao.JobDao;
import com.project.GuideJob.entity.Job;
import com.project.GuideJob.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable("id") long jobId) {
        ResponseEntity<Job> matchingJob = new ResponseEntity<Job>(jobService.getJobById(jobId), HttpStatus.OK);
        return matchingJob;
    }

    @PostMapping("/forAdmin")
    @PreAuthorize("hasRole('Admin')")
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);

    }

    @DeleteMapping("jobs/delete/{id}")
    @PreAuthorize("hasRole('Admin')")
    public String deleteJob(@PathVariable("id") Long id) {
        if (jobService.jobExists(id)) {
            jobService.deleteJob(id);
            return "Job deleted successfully";
        } else {
            return "Job was not found";
        }

    }
}
