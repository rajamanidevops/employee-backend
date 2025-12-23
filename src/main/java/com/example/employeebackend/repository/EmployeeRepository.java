package com.example.employeebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employeebackend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}



