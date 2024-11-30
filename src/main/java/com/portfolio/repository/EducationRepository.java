package com.portfolio.repository;

import com.portfolio.dto.EducationDTO;
import com.portfolio.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer> {
    @Query("select new com.portfolio.dto.EducationDTO(e.school, e.degree, e.major, e.startedAt, e.endedAt) from Education e")
    List<EducationDTO> getAllEducations();
}
