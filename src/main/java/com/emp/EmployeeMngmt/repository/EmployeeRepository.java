package com.emp.EmployeeMngmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.EmployeeMngmt.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
