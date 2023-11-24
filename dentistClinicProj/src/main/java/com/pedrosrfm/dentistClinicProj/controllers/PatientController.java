package com.pedrosrfm.dentistClinicProj.controllers;

import com.pedrosrfm.dentistClinicProj.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/patients")
public class PatientController {

    @Autowired
    private PatientService service;
}
