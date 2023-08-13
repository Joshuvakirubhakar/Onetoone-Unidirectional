package com.example.spring5webapp.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring5webapp.Entities.Employee;
import com.example.spring5webapp.ExceptionHandler.IdNotFoundException;
import com.example.spring5webapp.Repository.EmployeeRepo;
import com.example.spring5webapp.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> getallEmployees() {
		List<Employee> employee1 = employeeRepo.findAll();
		return employee1;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee1 = null;
		try {
			employee1 = employeeRepo.findById(id).get();
		} catch (Exception e) {
			throw new IdNotFoundException("Employee with id: " + id + " not found !!!");
		}
		return employee1;
	}

	@Override
	public Employee saveEmployees(Employee employee) {
		employeeRepo.save(employee);
		Employee employee2 = getEmployeeById(employee.getId());
		return employee2;
	}

	@Override
	public String deleteEmployee(int id) {
		try {
			employeeRepo.delete(getEmployeeById(id));
		} catch (Exception e) {
			throw new IdNotFoundException("Employee with id: " + id + " not found and Cannot be deleted!!!");
		}
		return "Employee with id: " + id + " is deleted !!!";
	}

}
