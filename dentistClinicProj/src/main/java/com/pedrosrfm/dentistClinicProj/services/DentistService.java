package com.pedrosrfm.dentistClinicProj.services;

import com.pedrosrfm.dentistClinicProj.repositories.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DentistService {

    @Autowired
    private DentistRepository repository;
}
