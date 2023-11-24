package com.pedrosrfm.dentistClinicProj.repositories;

import com.pedrosrfm.dentistClinicProj.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
