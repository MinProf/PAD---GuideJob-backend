package com.project.GuideJob.model;

import com.project.GuideJob.enumeration.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;

    private String domain; // drop down list to choose from

    @Column(unique = true)
    @NotEmpty(message = "The job's name cannot be empty or null")
    private String name;

    private String type; // part-time or full-time with a drop down list
    @NotEmpty(message = "Experience level must be specified")
    private String experienceLevel; // entry level, experienced etc.
    private String imageUrl; // optional
    private Employer employer; // must probably this information will be auto taken form the account that makes the announce
    @NotEmpty(message = "The job requires a description")
    private String description;

}
