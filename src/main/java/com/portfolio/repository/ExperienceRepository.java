package com.portfolio.repository;

import com.portfolio.dto.EducationDTO;
import com.portfolio.dto.ExperienceDTO;
import com.portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
    @Query("select new com.portfolio.dto.ExperienceDTO(e.title, e.organisation, e.startedAt, e.endedAt, e.isWorking) from Experience e")
    List<ExperienceDTO> getAllExperience();
}
