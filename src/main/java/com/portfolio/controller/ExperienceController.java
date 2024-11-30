package com.portfolio.controller;

import com.portfolio.response.EducationResponse;
import com.portfolio.response.ExperienceResponse;
import com.portfolio.service.EducationService;
import com.portfolio.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @GetMapping("/experience")
    private ExperienceResponse getExperience(){
        return experienceService.getExperience();
    }
}
