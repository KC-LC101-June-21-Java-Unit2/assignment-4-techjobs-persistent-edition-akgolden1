package org.launchcode.techjobs.persistent.controllers;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;
import org.launchcode.techjobs.persistent.models.Skill;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("skills")
public class SkillController {

    @Autowired
//this tells Spring to manage the repository and auto populate the employerReository field so we don't set anything here.
    private SkillRepository skillRepository;



    @GetMapping("add")
    public String displayAddSkillForm(Model model) {
        model.addAttribute(new Skill());
        return "skills/add";
    }



    @PostMapping("add")//do I need an @requestParam here?
    public String processAddSkillForm(@ModelAttribute @Valid Skill newSkill,
                                      Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "skills/add";
        }
        else {
            model.addAttribute("skill", skillRepository.findAll());
        }

        return "redirect:";
    }



    @GetMapping("view/{skillId}")//path parameter skillId. This piece of data customizes the response
    public String displayViewSkill(Model model, @PathVariable int skillId) {

        Optional optionalSkill = skillRepository.findById(skillId);
        if (optionalSkill.isPresent()) {
            Skill skill = (Skill) optionalSkill.get();
            model.addAttribute("skill", skillId);

            return "skills/view";
        } else {
            return "redirect:../";
        }
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute(new Skill());
        model.addAttribute("title", "My Skills");//not sure about this

        return "index";
    }









}
