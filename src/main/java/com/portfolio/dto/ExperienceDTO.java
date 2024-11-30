package com.portfolio.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class ExperienceDTO {
    private String title;
    private String organisation;
    private Date startedAt;
    private Date endedAt;
    private boolean isWorking;

    public ExperienceDTO(String title, String organisation, Date startedAt, Date endedAt, boolean isWorking) {
        this.title = title;
        this.organisation = organisation;
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.isWorking = isWorking;
    }
}
