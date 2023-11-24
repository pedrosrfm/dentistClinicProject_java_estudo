package com.pedrosrfm.dentistClinicProj.config;

import com.pedrosrfm.dentistClinicProj.entities.Dentist;
import com.pedrosrfm.dentistClinicProj.repositories.AppointmentRepository;
import com.pedrosrfm.dentistClinicProj.repositories.DentistRepository;
import com.pedrosrfm.dentistClinicProj.repositories.PatientRepository;
import com.pedrosrfm.dentistClinicProj.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private DentistRepository dentistRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void run(String... args) throws Exception {

        Dentist dentist1 = new Dentist(null, "João Souza", null);
        Dentist dentist2 = new Dentist(null, "Adriano Fonseca", null);
        Dentist dentist3 = new Dentist(null, "Louise Barbosa", null);

        dentistRepository.saveAll(Arrays.asList(dentist1, dentist2, dentist3));

    }
}
