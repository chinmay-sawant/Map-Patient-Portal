package com.chinmay.mapportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinmay.mapportal.models.ProgramsModel;

public interface  ProgramsRepo extends JpaRepository<ProgramsModel, Integer>{
    
}
