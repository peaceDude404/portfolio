package com.portfolio.response;

import com.portfolio.dto.SkillDTO;
import lombok.Data;

import java.util.List;

@Data
public class GetSkillResponse extends ServiceResponse {
    List<SkillDTO> skillDTOS;
}
