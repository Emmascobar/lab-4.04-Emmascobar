package com.ironhack.hospitals.controller.interfaces;

import com.ironhack.hospitals.enums.Status;
import com.ironhack.hospitals.model.Doctor;
import com.ironhack.hospitals.model.Patient;

import java.time.LocalDate;
import java.util.List;

public interface PatientsController {
    List<Patient> findAll();
    Patient getById(Integer Id);
    List<Patient> getByDateOfBirthBetween(LocalDate from, LocalDate to);

    List<Patient> getByAdmittedByDepartment(String department);
    List<Patient> getByAdmittedByStatus(Status status);

    Patient newPatient (Patient patient);


    //SON LOS MISMOS METODOS QUE EN EL REPO PERO AQUI MEJOR SI LOS
    //RENOMBRAMOS CON GET Y NO FIND.


}
