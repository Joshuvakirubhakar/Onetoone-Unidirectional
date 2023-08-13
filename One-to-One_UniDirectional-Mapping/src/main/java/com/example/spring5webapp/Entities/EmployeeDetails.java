package com.example.spring5webapp.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empdetailid;
	private int age;
	private String state;

	public EmployeeDetails(int empdetailid, int age, String state) {
		super();
		this.empdetailid = empdetailid;
		this.age = age;
		this.state = state;
	}

	public EmployeeDetails() {
		super();
	}

	public int getEmpdetailid() {
		return empdetailid;
	}

	public void setEmpdetailid(int empdetailid) {
		this.empdetailid = empdetailid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
