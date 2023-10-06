package com.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	//GeneratedValue to generate id automatically
	private int id;
	  
	private double salary;
	
	private String email;
	
	@Column(name="ename")
	private String name;
	
	public Employee() {
		
	}
	
	public Employee(int id, double salary, String email, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.email = email;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", email=" + email + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	
}



