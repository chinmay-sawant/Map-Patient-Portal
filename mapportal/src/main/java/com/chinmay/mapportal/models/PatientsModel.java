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
public class PatientsModel {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer patientId;
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private String dateOfBirth;
    private String address;
    private String medicalHistory;
    private String emergencyContact;
    private String prescribedDrug;
    private String socialSecurityNumber;
    private String gender;
    private String raceEthnicity;
    private String allergies;
    private String primaryCareProvider;
    private String medicationList;
    private String annualIncome;
    private String notes;
}
