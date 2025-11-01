package com.example.spring.jpa.controller;


import com.example.spring.jpa.service.JobService;
import com.example.spring.jpa.model.Job ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service ;

    @GetMapping("jobposts")
    public List<Job> getJobs(){
        return service.getjobs();
    }

    @GetMapping("job/{id}")
    public Job getJob(@PathVariable("id") int id){
        return service.getJob(id) ;
    }

    @PostMapping("job")
    public Job addJob(@RequestBody Job job){
        service.addJob(job) ;
        return service.getJob(job.getId()) ;
    }

    @PutMapping("job")
    public Job updateJob(@RequestBody Job job){
        service.updateJob(job);
        return service.getJob(job.getId()) ;
    }

    @DeleteMapping("job")
    public void deleteJob(@RequestBody Job job){
        service.deleteJob(job) ;
    }

    @PostMapping("jobposts")
    public List<Job> addJobPosts(@RequestBody List<Job> jobs){
        service.addJobPosts(jobs) ;
        return service.getjobs() ;
    }
}
