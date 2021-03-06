package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 10, max = 100)
    private String location;



    @OneToMany  //not sure about that parameter
    @JoinColumn (name = "employer_id")
    private  List <Job> jobs = new ArrayList<>();//this will be all items in a given job

    public String getLocation() {
        return location;
    }

    public Employer() {
        //empty constructor needed for Hibernate
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}

