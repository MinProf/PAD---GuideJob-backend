package com.project.GuideJob.controllers;

import com.project.GuideJob.entity.JobApply;
import com.project.GuideJob.service.JobApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobApplyController{
    @Autowired
    private JobApplyService jobApplyService;

    @PostMapping("/jobs/{userId}/{jobId}")
    @PreAuthorize("hasRole('User')")
    public JobApply applyJob(@PathVariable("userId") Long userId, @PathVariable("jobId") Long jobId){
        return jobApplyService.addJobApply(userId, jobId);
    }
}
