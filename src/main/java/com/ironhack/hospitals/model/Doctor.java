package com.ironhack.hospitals.model;
import com.ironhack.hospitals.enums.Status;
import jakarta.persistence.*;

@Entity
public class Doctor {

    @Id
    @Column(name = "id_employee")
    private Integer employeeId;
    private String department;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Doctor() {
    }

    public Doctor(Integer employeeId, String department, String name, Status status) {
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
        this.status = status;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

