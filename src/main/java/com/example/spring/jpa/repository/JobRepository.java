package com.example.spring.jpa.repository;


import com.example.spring.jpa.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job , Integer> {


}




//private List<Job> jobDb = new ArrayList<Job>(Arrays.asList(
//        new Job(1, "Android Developer",
//                "Design and build advanced applications for the Android platform.",
//                Arrays.asList("Kotlin", "Jetpack Compose", "REST API", "MVVM", "Firebase")),
//
//        new Job(2, "Backend Developer",
//                "Build scalable RESTful APIs and manage database interactions.",
//                Arrays.asList("Java", "Spring Boot", "MySQL", "Docker", "JWT Auth")),
//
//        new Job(3, "Frontend Developer",
//                "Create responsive and dynamic web UIs for modern browsers.",
//                Arrays.asList("HTML", "CSS", "JavaScript", "React", "Bootstrap")),
//
//        new Job(4, "Data Analyst",
//                "Interpret data and provide actionable business insights.",
//                Arrays.asList("Python", "Pandas", "NumPy", "Power BI", "SQL")),
//
//        new Job(5, "UI/UX Designer",
//                "Design engaging user experiences and interactive prototypes.",
//                Arrays.asList("Figma", "Adobe XD", "Wireframing", "User Research")),
//
//        new Job(6, "DevOps Engineer",
//                "Automate deployment pipelines and manage infrastructure.",
//                Arrays.asList("AWS", "Docker", "Kubernetes", "Jenkins", "CI/CD")),
//
//        new Job(7, "Machine Learning Engineer",
//                "Develop and deploy ML models for predictive analytics.",
//                Arrays.asList("Python", "TensorFlow", "Scikit-learn", "Data Preprocessing")),
//
//        new Job(8, "Cybersecurity Analyst",
//                "Monitor and secure systems from potential threats.",
//                Arrays.asList("Network Security", "Firewalls", "Penetration Testing", "SIEM Tools"))
//));
//
//
//public List<Job> getJobs() {
//    return jobDb ;
//}
//
//public Job getJob(int id) {
//    for (Job job : jobDb){
//        if (job.getId() == id){
//            return job ;
//        }
//    }
//    return null;
//}
//
//public void addJob(Job job) {
//    jobDb.add(job) ;
//}
//
//public void updateJob(Job job) {
//    for (Job job1 : jobDb){
//        if(job1.getId() == job.getId()){
//            job1.setJname(job.getJname());
//            job1.setDesc(job.getDesc());
//            job1.setJreq(job.getJreq());
//            break;
//        }
//    }
//}
//
//public Job deleteJob(Job job) {
//    for (Job job1 : jobDb){
//        if(job1.getId() == job.getId()){
//            jobDb.remove(job1) ;
//            return job ;
//        }
//    }
//    return null ;
//}
