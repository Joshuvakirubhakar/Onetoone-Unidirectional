package com.example.spring5webapp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring5webapp.Entities.Employee;
import com.example.spring5webapp.Repository.EmployeeRepo;
import com.example.spring5webapp.Service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getallEmployees(){
//		List<Employee> employee1 = employeeRepo.findAll();
		return new ResponseEntity<>(employeeService.getallEmployees(), HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id){
//		Optional<Employee> employee1 = employeeRepo.findById(id);
//		return employee1.get();
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployees(@RequestBody Employee employee){
//		employeeRepo.save(employee);
//		Employee employee2 = getEmployeeBy(employee.getId());
		return new ResponseEntity<>(employeeService.saveEmployees(employee), HttpStatus.OK);
	}
	
	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id){
//		employeeRepo.delete(getEmployeeBy(id));
//		return new ResponseEntity<>("Employee with id: "+id +" is deleted !!!", HttpStatus.OK);
		return new ResponseEntity<>(employeeService.deleteEmployee(id),HttpStatus.OK);
	}
	
}
