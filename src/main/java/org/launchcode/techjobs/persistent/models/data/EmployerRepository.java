package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository//tells spring boot to manage this and make it available to other classes
//also tells program that this is a class that will store objects in the DB
@Transactional
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
//remember that we need a concrete class to implement an interface normally. To end up with an object of repository type
    //we pass the CrudRep the types of things we're storing, so the object and the data type of the primary key
}
