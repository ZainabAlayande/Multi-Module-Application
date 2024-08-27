package com.example.multimodule.service;

import com.example.multimodule.model.Patient;

import java.util.List;

public interface PatientService {

    Patient createPatientAccount(String name, String phoneNumber, String email);

    List<Patient> getAllPatient();

}
