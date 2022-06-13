package com.project.GuideJob.controllers;

import com.project.GuideJob.entity.Job;
import com.project.GuideJob.entity.JobApply;
import com.project.GuideJob.service.JobApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobApplyController{
    @Autowired
    private JobApplyService jobApplyService;

    @PostMapping("/jobs/{userId}/{jobId}")
    @PreAuthorize("hasRole('User')")
    public JobApply applyJob(@PathVariable("userId") Long userId, @PathVariable("jobId") Long jobId){
        return jobApplyService.addJobApply(userId, jobId);
    }

    @GetMapping("/jobs/appliedJobs/{id}")
    @PreAuthorize("hasRole('User')")
    public List<Job> getAppliedJobs(@PathVariable("id") long userId){
        return jobApplyService.viewAppliedJobs(userId);
    }
}
