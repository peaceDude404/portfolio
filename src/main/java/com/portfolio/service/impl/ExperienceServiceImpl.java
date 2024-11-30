package com.portfolio.service.impl;

import com.portfolio.dto.ExperienceDTO;
import com.portfolio.repository.ExperienceRepository;
import com.portfolio.response.ExperienceResponse;
import com.portfolio.service.ExperienceService;
import com.portfolio.utils.constants.MessageConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public ExperienceResponse getExperience() {
        ExperienceResponse response = new ExperienceResponse();
        List<ExperienceDTO> experienceDTOS = experienceRepository.getAllExperience();
        response.setExperienceDTOS(experienceDTOS);
        response.setMessage(MessageConstant.EXPERIENCE_FETCHED_SUCCESSFULLY);
        response.setHttpStatusCode(HttpStatus.OK);
        return response;
    }
}
