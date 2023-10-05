package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService
{
	@Autowired
   private EmployeeRepository employeeRepository;
	@Override
	public Employee createEmployee(Employee employee) {
		System.out.println("two-c");
		return employeeRepository.save(employee);	}

 

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();

	}

 

	@Override
	public Optional<Employee> getEmployee() {
		 {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	}
 

	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployee(int id) {
		
		return employeeRepository.getById(id);
	}



	@Override
	public Employee updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);

	}

 

}
