package com.ironhack.hospitals.Repository;
import com.ironhack.hospitals.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctor, Integer> {

    List<Doctor> findByStatus(String status);

    List<Doctor> findByDepartment(String department);


}
