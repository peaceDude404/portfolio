package com.portfolio.response;

import com.portfolio.dto.ExperienceDTO;
import lombok.Data;

import java.util.List;

@Data
public class ExperienceResponse extends ServiceResponse{
    private List<ExperienceDTO> experienceDTOS;
}
