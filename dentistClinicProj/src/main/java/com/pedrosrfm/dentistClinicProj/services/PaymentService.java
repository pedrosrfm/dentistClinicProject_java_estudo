package com.pedrosrfm.dentistClinicProj.services;

import com.pedrosrfm.dentistClinicProj.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;
}
