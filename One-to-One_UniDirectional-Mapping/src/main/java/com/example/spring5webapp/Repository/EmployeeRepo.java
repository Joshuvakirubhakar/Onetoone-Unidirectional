package com.example.spring5webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring5webapp.Entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
