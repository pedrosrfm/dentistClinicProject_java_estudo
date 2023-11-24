package com.pedrosrfm.dentistClinicProj.controllers;

import com.pedrosrfm.dentistClinicProj.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dentists")
public class DentistController {

    @Autowired
    private DentistService service;
}
