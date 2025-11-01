package com.example.spring.jpa.service;


import com.example.spring.jpa.model.Job;
import com.example.spring.jpa.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService{

    @Autowired
    private JobRepository repo ;


    public List<Job> getjobs() {
        return repo.findAll() ;
    }

    public Job getJob(int id) {
        return repo.findById(id).orElse(null) ;
    }

    public void addJob(Job job) {
        repo.save(job) ;
    }

    public void updateJob(Job job) {
        repo.save(job);
    }

    public void deleteJob(Job job) {
        repo.delete(job); ;
    }

    public void addJobPosts(List<Job> jobs){
        repo.saveAll(jobs) ;
    }
}
