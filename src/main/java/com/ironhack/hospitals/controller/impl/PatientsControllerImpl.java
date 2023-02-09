package com.ironhack.hospitals.controller.impl;
import com.ironhack.hospitals.Repository.PatientsRepository;
import com.ironhack.hospitals.controller.interfaces.PatientsController;
import com.ironhack.hospitals.enums.Status;
import com.ironhack.hospitals.model.Doctor;
import com.ironhack.hospitals.model.Patient;
import com.ironhack.hospitals.service.interfaces.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class PatientsControllerImpl implements PatientsController {

    @Autowired
    private PatientsRepository patientsRepository;
    private PatientServices patientServices;

    @GetMapping("/patients")
    public List<Patient> findAll() {
        return patientsRepository.findAll();
    }

    @GetMapping("/patients/¨{id}")
    public Patient getById(@PathVariable(name = "id") Integer id) {
        return patientsRepository.findById(id).get();
    }

    @GetMapping("/patients/dob")
    public List<Patient> getByDateOfBirthBetween(@RequestParam LocalDate from, @RequestParam LocalDate to) {
        return patientsRepository.findByDateOfBirthBetween(from, to);
    }

    @GetMapping("/patients/admittedByDepartment/{department}")
    public List<Patient> getByAdmittedByDepartment(@PathVariable String department) {
        return patientsRepository.findByDoctorDepartment(department);
    }

    @GetMapping("/patients/AdmittedByStatus/{status}")
    public List<Patient> getByAdmittedByStatus(@PathVariable Status status) {
        return patientsRepository.findByDoctorStatus(status.OFF);
    }

    @PostMapping("/patients")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient newPatient (@RequestBody Patient patient) {
        return patientsRepository.save(patient);
    }

    @PutMapping("/patients/{id}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void generalUpdate(@PathVariable Integer id, @RequestBody Patient patient) {
        patientServices.generalUpdate(id, patient);
    }

}
