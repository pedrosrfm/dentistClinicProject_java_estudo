package com.pedrosrfm.dentistClinicProj.controllers;

import com.pedrosrfm.dentistClinicProj.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dentists")
public class PaymentController {

    @Autowired
    private PaymentService service;
}
