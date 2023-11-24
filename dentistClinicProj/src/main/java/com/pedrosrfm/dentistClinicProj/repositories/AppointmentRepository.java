package com.pedrosrfm.dentistClinicProj.repositories;

import com.pedrosrfm.dentistClinicProj.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
