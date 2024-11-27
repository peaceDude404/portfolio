package com.portfolio.service.impl;

import com.portfolio.dto.SkillDTO;
import com.portfolio.repository.SkillsRepository;
import com.portfolio.response.GetSkillResponse;
import com.portfolio.service.SkillService;
import com.portfolio.utils.constants.MessageConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public GetSkillResponse getSkills() {
        GetSkillResponse response = new GetSkillResponse();
        List<SkillDTO> skillDTOS = skillsRepository.findAllSkills();
        response.setSkillDTOS(skillDTOS);
        response.setMessage(MessageConstant.SKILLS_FETCHED_SUCCESSFULLY);
        response.setHttpStatusCode(HttpStatus.OK);
        return response;
    }
}
