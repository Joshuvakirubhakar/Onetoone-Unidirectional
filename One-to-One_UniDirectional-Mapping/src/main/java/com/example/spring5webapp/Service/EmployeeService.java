package com.example.spring5webapp.Service;

import java.util.List;

import com.example.spring5webapp.Entities.Employee;

public interface EmployeeService {

	List<Employee> getallEmployees();
	Employee getEmployeeById(int id);
	Employee saveEmployees(Employee employee);
	String deleteEmployee(int id);
	
}
