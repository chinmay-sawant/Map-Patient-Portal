package com.chinmay.mapportal.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinmay.mapportal.models.ProgramsModel;
import com.chinmay.mapportal.repository.ProgramsRepo;
import com.chinmay.mapportal.services.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService {

    private final ProgramsRepo programsRepo;
    
    public ProgramServiceImpl(ProgramsRepo programsRepo) {
        this.programsRepo = programsRepo;
    }   

    @Override
    public List<ProgramsModel> getAll() {
        return programsRepo.findAll();
    }

    @Override
    public ProgramsModel getById(Long id) {
        return programsRepo.findById(id.intValue()).orElse(null);
    }

    @Override
    public ProgramsModel save(ProgramsModel entity) {
        return programsRepo.save(entity);
    }

    @Override
    public List<ProgramsModel> saveAll(List<ProgramsModel> entityList) {
        return programsRepo.saveAll(entityList);
    }

    @Override
    public void delete(ProgramsModel entity) {
        programsRepo.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        programsRepo.deleteById(id.intValue());
    }
    
}
