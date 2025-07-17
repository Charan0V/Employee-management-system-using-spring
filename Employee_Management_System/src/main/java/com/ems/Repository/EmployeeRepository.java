package com.ems.Repository;

import com.ems.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Search by first name, last name, or email (case-insensitive, containing)
    List<Employee> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String firstName, String lastName, String email);
}
