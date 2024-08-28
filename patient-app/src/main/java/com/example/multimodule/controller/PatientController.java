package com.example.multimodule.controller;


import com.example.multimodule.model.Patient;
import com.example.multimodule.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/create-patient")
    public ResponseEntity<?> createPatientRecord(@RequestBody PatientDto patientDto) {
        Patient newPatient = patientService.createPatientAccount(patientDto.getName(), patientDto.getPhoneNumber(), patientDto.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(newPatient);
    }


    @GetMapping("/patients")
    public ResponseEntity<?> getAllPatientRecord() {
        var response = patientService.getAllPatient();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
