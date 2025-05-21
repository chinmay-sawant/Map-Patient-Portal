package com.chinmay.mapportal.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinmay.mapportal.models.ProgramsModel;
import com.chinmay.mapportal.services.ProgramService;

@RestController
@RequestMapping("/api/v1/programs")
public class ProgramsController {
    
    private final ProgramService programService;

    public ProgramsController(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping
    public List<ProgramsModel> getAll() {
        return programService.getAll();
    }

    @GetMapping("/{id}")
    public ProgramsModel getById(@PathVariable Long id) {
        return programService.getById(id);
    }

    @PostMapping
    public ProgramsModel create(@RequestBody ProgramsModel program) {
        return programService.save(program);
    }

    @PutMapping("/{id}")
    public ProgramsModel update(@PathVariable Long id, @RequestBody ProgramsModel program) {
        program.setProgramId(id.intValue());
        return programService.save(program);
    }

    @PatchMapping("/{id}")
    public ProgramsModel patch(@PathVariable Long id, @RequestBody ProgramsModel program) {
        ProgramsModel existingProgram = programService.getById(id);
        if (existingProgram != null) {
            // Apply partial updates based on the fields present in the request body
            if (program.getProgram_Name() != null) {
                existingProgram.setProgram_Name(program.getProgram_Description());
            }
            if (program.getProgram_Description() != null) {
                existingProgram.setProgram_Description(program.getProgram_Description());
            }
            // Save the updated program
            return programService.save(existingProgram);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        programService.deleteById(id);
    }

}
