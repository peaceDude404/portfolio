package com.portfolio.controller;

import com.portfolio.dto.SkillDTO;
import com.portfolio.response.GetSkillResponse;
import com.portfolio.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping("/skills")
    public GetSkillResponse getSkills() {
        return skillService.getSkills();
    }
}
