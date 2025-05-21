package com.chinmay.mapportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinmay.mapportal.models.PatientsModel;

public interface PatientRepo extends JpaRepository<PatientsModel, Integer> {
    
}
