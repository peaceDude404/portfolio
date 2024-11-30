package com.portfolio.service.impl;

import com.portfolio.dto.EducationDTO;
import com.portfolio.repository.EducationRepository;
import com.portfolio.response.EducationResponse;
import com.portfolio.service.EducationService;
import com.portfolio.utils.constants.MessageConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationRepository repository;

    @Override
    public EducationResponse getEducation() {
        EducationResponse response = new EducationResponse();
        List<EducationDTO> educationDTOS = repository.getAllEducations();
        response.setEducationDTOS(educationDTOS);
        response.setMessage(MessageConstant.EDUCATION_FETCHED_SUCCESSFULLY);
        response.setHttpStatusCode(HttpStatus.OK);
        return response;
    }
}
