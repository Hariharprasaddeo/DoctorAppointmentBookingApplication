package com.practo.service;

import com.practo.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PatientService {

    List<Patient> getAllPatients();
    Patient createPatient(Patient patient);
}
