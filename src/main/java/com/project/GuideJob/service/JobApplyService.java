package com.project.GuideJob.service;

import com.project.GuideJob.dao.JobApplyDao;
import com.project.GuideJob.dao.JobDao;
import com.project.GuideJob.dao.UserDao;
import com.project.GuideJob.entity.Job;
import com.project.GuideJob.entity.JobApply;
import com.project.GuideJob.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobApplyService {
    @Autowired
    private JobApplyDao jobApplyDao;

    @Autowired
    private JobDao jobDao;

    @Autowired
    private UserDao userDao;

    public JobApplyService(JobApplyDao jobApplyDao){
        this.jobApplyDao = jobApplyDao;
    }

    public JobApply addJobApply(long userId, long jobId){
        Optional<Job> job = jobDao.findById(jobId);
        Optional<User> user = userDao.findById(userId);
        JobApply jobApply = new JobApply(userId, jobId);
        if (!this.applyExists(userId, jobId)){
            if (job.isPresent() && user.isPresent()) {
                System.out.println( "Applied!");
                return jobApplyDao.save(jobApply);
            } else {

                System.out.println("Job or user invalid.");
                return null;
            }} else {
            System.out.println("You already applied to this job.");
            return  null;

        }
    }

    public Boolean applyExists(long userId, long jobId){
        JobApply jobApply = jobApplyDao.findByUseridAndJobid(userId, jobId);
        if(jobApply != null){
            return true;
        } else {
            return false;
        }
    }
    
    public List<Job> viewAppliedJobs(long userId){
        List<JobApply> jobApplyList = jobApplyDao.findById(userId).stream().collect(Collectors.toList());
        List<Job> jobList = new ArrayList<>();
        for (JobApply jobApply : jobApplyList) {
            jobList.add(jobDao.findById(jobApply.getJobId()).get());
        }
        return jobList;
    }
}
