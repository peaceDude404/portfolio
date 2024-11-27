package com.portfolio.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "school")
    private String school;
    @Column(name = "degree")
    private String degree;
    @Column(name = "major")
    private String major;
    @Column(name = "started_at")
    private Date startedAt;
    @Column(name = "ended_at")
    private Date endedAt;
}
