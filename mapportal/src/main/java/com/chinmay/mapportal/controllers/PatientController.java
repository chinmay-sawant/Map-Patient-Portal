package com.chinmay.mapportal.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinmay.mapportal.models.PatientsModel;
import com.chinmay.mapportal.services.PatientService;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {
    
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<PatientsModel> getAll() {
        return patientService.getAll();
    }

    @GetMapping("/{id}")
    public PatientsModel getById(@PathVariable Long id) {
        return patientService.getById(id);
    }

    @PostMapping
    public PatientsModel save(@RequestBody PatientsModel patientsModel) {
        return patientService.save(patientsModel);
    }

    @PostMapping("/all")
    public List<PatientsModel> saveAll(@RequestBody List<PatientsModel> patientsModelList) {
        return patientService.saveAll(patientsModelList);
    }

    @DeleteMapping
    public void delete(@RequestBody PatientsModel patientsModel) {
        patientService.delete(patientsModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        patientService.deleteById(id);
    }

    @PutMapping("/{id}")
    public PatientsModel update(@PathVariable Long id, @RequestBody PatientsModel patientsModel) {
        PatientsModel existingPatient = patientService.getById(id);
        if (existingPatient != null) {
            patientsModel.setPatientId(id.intValue());
            return patientService.save(patientsModel);
        } else {
            return null;
        }
    }

    

}
