package com.pedrosrfm.dentistClinicProj.services;

import com.pedrosrfm.dentistClinicProj.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;
}
