package com.ironhack.hospitals.model;

import jakarta.persistence.*;

import javax.print.Doc;
import java.time.LocalDateTime;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Integer id;
    private String name;
    private LocalDateTime dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "admitted_by") // Esto creara la tabla admitted By donde se pondra el Id de doctor.
    private Doctor doctor;

    public Patient() {
    }

    public Patient(Integer id, String name, LocalDateTime dateOfBirth, Doctor doctor) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.doctor = doctor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
