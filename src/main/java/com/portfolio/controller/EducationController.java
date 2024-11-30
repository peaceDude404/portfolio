package com.portfolio.controller;

import com.portfolio.response.EducationResponse;
import com.portfolio.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

    @Autowired
    private EducationService educationService;

    @GetMapping("/education")
    private EducationResponse getEducation(){
        return educationService.getEducation();
    }
}
