package com.ironhack.hospitals.controller.impl;
import com.ironhack.hospitals.Repository.DoctorsRepository;
import com.ironhack.hospitals.controller.dto.DoctorDepartmentDTO;
import com.ironhack.course.controller.dto.DoctorStatusDTO;
import com.ironhack.hospitals.controller.interfaces.DoctorsController;
import com.ironhack.hospitals.enums.Status;
import com.ironhack.hospitals.model.Doctor;
import com.ironhack.hospitals.service.interfaces.DoctorServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
import java.util.Optional;

@RestController
public class DoctorsControllerImpl implements DoctorsController {

    @Autowired
    private DoctorsRepository doctorsRepository;
    private DoctorServices doctorServices;

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors() {
        return doctorsRepository.findAll();
    }

    @GetMapping("/doctors/{id}")
    public Doctor getById(@PathVariable(name = "id") Integer Id) {
        return doctorsRepository.findById(Id).get();
    }

    @GetMapping("/doctors/status/{status}")
    public List<Doctor> getByStatus(@PathVariable("status") String status) {
        return doctorsRepository.findByStatus(status);
    }

    @GetMapping("/doctors/departments/{departarment}")
    public List<Doctor> getByDepartment(@PathVariable(name = "department") String department) {
        return doctorsRepository.findByDepartment(department);
    }

    @PostMapping("/doctors")
    @ResponseStatus(HttpStatus.CREATED)
        public Doctor newDoctor(@RequestBody @Valid Doctor doctor) {
            return doctorsRepository.save(doctor);
        }

    @PatchMapping("/doctors/{status}/status")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeStatus(@PathVariable Integer id, @RequestBody @Valid DoctorStatusDTO status) {
        doctorServices.changeStatus(id, status);
    }

    @PatchMapping("/doctors/{department}/department")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDepartment(@PathVariable Integer id, @RequestBody @Valid DoctorDepartmentDTO department) {
        doctorServices.updateDepartment(id, department);

    }
}
