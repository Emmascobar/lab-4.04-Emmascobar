package com.ironhack.hospitals.Repository;
import com.ironhack.hospitals.enums.Status;
import com.ironhack.hospitals.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PatientsRepository extends JpaRepository<Patient, Integer> {

    Optional<Patient> findById(Integer Id);
    List<Patient> findByDateOfBirthBetween(LocalDate from, LocalDate to);
    List<Patient> findByDoctorDepartment(String department);

    List<Patient> findByDoctorStatus(Status status);
}
