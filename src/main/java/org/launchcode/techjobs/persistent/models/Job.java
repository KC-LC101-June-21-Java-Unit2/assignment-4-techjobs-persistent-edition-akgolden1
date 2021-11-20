package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//Originally I didn't have Job extending AbstractEntity
public class Job extends AbstractEntity{
//Removed ID and name fields per testTaskThree. We don't need them once e extend the AbstractEntity
//    @Id
//    @GeneratedValue
//    private int id;

    //private String name;

@ManyToOne //per step 3
    private Employer employer;//per step 2



    //private Skill skill;
    //private String skills;//only added because of test
@ManyToMany
    private  List<Skill>skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
       //this.skills = someSkills; do I not need this anymore

    }

    // Getters and setters.

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
//
//    public void setSkills(Skill skill) {
//        this.skill = skill;
//    }
}
