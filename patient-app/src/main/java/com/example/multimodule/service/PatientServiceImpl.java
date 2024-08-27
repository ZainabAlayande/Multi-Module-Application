package com.example.multimodule.service;

import com.example.multimodule.model.Patient;
import com.example.multimodule.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService{

    private final PatientRepository patientRepository;


    @Override
    public Patient createPatientAccount(String name, String phoneNumber, String email) {
        Patient patient = Patient.builder().email(email).phoneNumber(phoneNumber).name(name).build();
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

}
