package com.pedrosrfm.dentistClinicProj.services;

import com.pedrosrfm.dentistClinicProj.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;
}
