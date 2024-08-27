package com.example.service;

import com.example.model.Patient;

import java.util.List;

public interface PatientService {

    Patient createPatientAccount(String name, String phoneNumber, String email);

    List<Patient> getAllPatient();

}
