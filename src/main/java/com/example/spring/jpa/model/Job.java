package com.example.spring.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Job {
    @Id
    int id ;
    String jname ;
    String jdesc;
    List<String> jreq ;

    public Job()
    {

    }

    public Job(int id, String jname, String jdesc, List<String> jreq) {
        this.id = id;
        this.jname = jname;
        this.jdesc = jdesc;
        this.jreq = jreq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getJdesc() {
        return jdesc;
    }

    public void setJdesc(String jdesc) {
        this.jdesc = jdesc;
    }

    public List<String> getJreq() {
        return jreq;
    }

    public void setJreq(List<String> jreq) {
        this.jreq = jreq;
    }
}
