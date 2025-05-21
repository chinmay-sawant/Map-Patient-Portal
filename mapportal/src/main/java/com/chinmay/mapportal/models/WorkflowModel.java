package com.chinmay.mapportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkflowModel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer workflowId; // Workflow ID

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "patientId")
    private PatientsModel patientId; // Patient Id

    @ManyToOne
    @JoinColumn(name = "program_id", referencedColumnName = "programId")
    private ProgramsModel programId; // Program Id

    private String filePathPrescriptionFile; // Path to Prescription File
}
