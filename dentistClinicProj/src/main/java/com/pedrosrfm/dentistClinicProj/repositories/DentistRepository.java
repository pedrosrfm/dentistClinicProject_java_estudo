package com.pedrosrfm.dentistClinicProj.repositories;

import com.pedrosrfm.dentistClinicProj.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
