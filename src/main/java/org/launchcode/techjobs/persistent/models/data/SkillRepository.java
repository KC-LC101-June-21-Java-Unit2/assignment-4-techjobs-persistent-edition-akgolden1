package org.launchcode.techjobs.persistent.models.data;
import org.launchcode.techjobs.persistent.models.Skill;
import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository//tells program that this is a class that will store objects in the DB
//@Transactional
public interface SkillRepository extends CrudRepository <Skill, Integer> {
}
