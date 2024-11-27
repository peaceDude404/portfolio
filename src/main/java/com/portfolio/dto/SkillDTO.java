package com.portfolio.dto;

import com.portfolio.utils.enums.Proficiency;
import lombok.Data;

@Data
public class SkillDTO {
    private String skillName;
    private Proficiency proficiency;

    public SkillDTO(String skillName, Proficiency proficiency) {
        this.skillName = skillName;
        this.proficiency = proficiency;
    }
}
