package com.portfolio.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EducationDTO {
    private String school;
    private String degree;
    private String major;
    private Date startedAt;
    private Date endedAt;

    public EducationDTO(String school, String degree, String major, Date startedAt, Date endedAt) {
        this.school = school;
        this.degree = degree;
        this.major = major;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
    }
}
