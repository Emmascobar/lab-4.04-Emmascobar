package com.ironhack.hospitals.service.impl;

import com.ironhack.hospitals.Repository.PatientsRepository;
import com.ironhack.hospitals.model.Doctor;
import com.ironhack.hospitals.model.Patient;
import com.ironhack.hospitals.service.interfaces.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class PatientServicesImpl implements PatientServices {

    @Autowired
    private PatientsRepository patientsRepository;

    @PutMapping("/patients/{id}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void generalUpdate(@PathVariable Integer id, @RequestBody Patient patient) {
        Optional<Patient> optionalPatient = patientsRepository.findById(id);
        if(!optionalPatient.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pacient not found");
        }
        patientsRepository.save(patient);
    }
}
