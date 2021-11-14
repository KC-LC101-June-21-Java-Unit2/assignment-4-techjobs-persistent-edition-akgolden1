package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity

public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min=10, max=100)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {
         //empty constructor needed for Hibernate
    }


}

