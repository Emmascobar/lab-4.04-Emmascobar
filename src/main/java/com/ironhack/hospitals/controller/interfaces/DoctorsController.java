package com.ironhack.hospitals.controller.interfaces;

import com.ironhack.hospitals.Repository.DoctorsRepository;
import com.ironhack.hospitals.model.Doctor;

import javax.print.Doc;
import java.util.List;

public interface DoctorsController {

    List<Doctor> getAllDoctors();
    Doctor getById(Integer Id);

    List<Doctor> getByStatus(String status);

    List<Doctor> getByDepartment(String department);

    Doctor newDoctor (Doctor doctor);

}
