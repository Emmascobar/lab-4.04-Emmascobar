package com.ironhack.hospitals.service.impl;
import com.ironhack.course.controller.dto.DoctorStatusDTO;
import com.ironhack.hospitals.Repository.DoctorsRepository;
import com.ironhack.hospitals.controller.dto.DoctorDepartmentDTO;
import com.ironhack.hospitals.enums.Status;
import com.ironhack.hospitals.model.Doctor;
import com.ironhack.hospitals.service.interfaces.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class DoctorServicesImpl implements DoctorServices {

    @Autowired
    private DoctorsRepository doctorsRepository;

    @PatchMapping("/doctors/{status}/status")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeStatus(@PathVariable Integer id, @RequestBody DoctorStatusDTO status) {
        Optional<Doctor> optionalDoctor = doctorsRepository.findById(id);
        if(!optionalDoctor.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor not found");
        }
        optionalDoctor.get().setStatus(status.getStatus());
        doctorsRepository.save(optionalDoctor.get());
        //Se debe guardar siempre?? o con el set es suficiente?
    }

    @PatchMapping("/doctors/{department}/department")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDepartment(@PathVariable Integer id, @RequestBody DoctorDepartmentDTO department) {
        Optional<Doctor> optionalDoctor = doctorsRepository.findById(id);
        if(!optionalDoctor.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Doctor not found");
        }
        optionalDoctor.get().setDepartment(department.getDepartment());
        doctorsRepository.save(optionalDoctor.get());
    }

}
