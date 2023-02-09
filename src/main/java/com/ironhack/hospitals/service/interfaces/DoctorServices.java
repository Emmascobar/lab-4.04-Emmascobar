package com.ironhack.hospitals.service.interfaces;
import  com.ironhack.course.controller.dto.DoctorStatusDTO;
import com.ironhack.hospitals.controller.dto.DoctorDepartmentDTO;
import com.ironhack.hospitals.enums.Status;
import com.ironhack.hospitals.model.Doctor;

public interface DoctorServices {

    void changeStatus(Integer id, DoctorStatusDTO status);

    void updateDepartment(Integer id, DoctorDepartmentDTO department);





}
