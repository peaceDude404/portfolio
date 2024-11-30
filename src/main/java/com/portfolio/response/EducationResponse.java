package com.portfolio.response;

import com.portfolio.dto.EducationDTO;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EducationResponse extends ServiceResponse{
    private List<EducationDTO> educationDTOS;
}
