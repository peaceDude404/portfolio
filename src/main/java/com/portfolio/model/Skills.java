package com.portfolio.model;

import com.portfolio.utils.enums.Proficiency;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "proficiency")
    @Enumerated(EnumType.STRING) // for making the connection between jdbc database object as string
    private Proficiency proficiency;
}
