package com.ironhack.hospitals.controller.dto;

import com.ironhack.hospitals.enums.Status;
import jakarta.validation.constraints.NotEmpty;

public class DoctorDepartmentDTO {

    @NotEmpty(message = "Sorry, doctors should always have a department.")
    private String department ;

    public DoctorDepartmentDTO() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
