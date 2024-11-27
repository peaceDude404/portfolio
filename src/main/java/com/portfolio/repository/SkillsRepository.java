package com.portfolio.repository;

import com.portfolio.dto.SkillDTO;
import com.portfolio.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer> {
    @Query("select new com.portfolio.dto.SkillDTO(s.skillName, s.proficiency) from Skills s")
    List<SkillDTO> findAllSkills();
}
