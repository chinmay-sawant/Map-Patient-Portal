package com.chinmay.mapportal.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chinmay.mapportal.models.PatientsModel;
import com.chinmay.mapportal.repository.PatientRepo;
import com.chinmay.mapportal.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
    private final PatientRepo patientRepo;

    public PatientServiceImpl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    // Implement methods from PatientService interface here
    @Override
    public List<PatientsModel> getAll() {
        return patientRepo.findAll();
    }

    @Override
    public PatientsModel getById(Long id) {
        return patientRepo.findById(id.intValue()).orElse(null);
    }

    @Override
    public PatientsModel save(PatientsModel patientsModel) {
        return patientRepo.save(patientsModel);
    }

    @Override
    public List<PatientsModel> saveAll(java.util.List<PatientsModel> patientsModelList) {
        return patientRepo.saveAll(patientsModelList);
    }

    @Override
    public void delete(PatientsModel patientsModel) {
        patientRepo.delete(patientsModel);
    }

    @Override
    public void deleteById(Long id) {
        patientRepo.deleteById(id.intValue());
    }
}
