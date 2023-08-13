package com.example.spring5webapp.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)  /* Can't use generation type*/
	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "emp_id")
	private EmployeeDetails details;

	public Employee() {
		super();
	}

	public Employee(int id, String name, EmployeeDetails details) {
		super();
		this.id = id;
		this.name = name;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeDetails getDetails() {
		return details;
	}

	public void setDetails(EmployeeDetails details) {
		this.details = details;
	}

}
