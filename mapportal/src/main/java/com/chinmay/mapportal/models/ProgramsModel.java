package com.chinmay.mapportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProgramsModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer programId;
    private String Program_Name;
    private String Program_Description;
    private String Eligibility_Criteria;
    private String Program_Start_Date;
    private String Program_End_Date;
    private String Program_Coordinator;
    private String Program_Location;
    private String Funding_Source;
    private String Enrollment_Status;
    private String Services_Offered;
    private String Target_Population;
    private String Outcome_Measures;
    private String Notes;
}
