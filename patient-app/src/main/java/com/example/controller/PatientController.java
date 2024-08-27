package com.example.controller;


import com.example.service.PatientService;

public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    public Object createPatientRecord() {
        return patientService.createPatientAccount("", "", "");
    }

    public Object getAllPatientRecord() {
        return patientService.getAllPatient();
    }


}
