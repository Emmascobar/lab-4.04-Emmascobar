package com.ironhack.course.controller.dto;
import com.ironhack.hospitals.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
public class DoctorStatusDTO {

    @NotBlank(message = "Sorry, doctors should always have a status.")
    private Status status;

    public DoctorStatusDTO() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
