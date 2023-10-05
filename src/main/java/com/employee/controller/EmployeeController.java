package com.employee.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/empdata")
public class EmployeeController {
    @Autowired
EmployeeService employeeservice;
	@PostMapping(value="/create")
     public Employee createEmployee(@RequestBody Employee employee) {
	   return employeeservice.createEmployee(employee); 	
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployees(){
		List<Employee> empList = employeeservice.getAllEmployee();
		if(empList!=null && !(empList.isEmpty())) {
			return empList;
		}else {
			return Collections.emptyList();
		}
	}
	
	@PostMapping("/deleteEmp")
	public void deleteEmployees(@RequestBody int id){
		
		employeeservice.deleteEmployee(id); 
	}
	
	@GetMapping("/getEmp")
	public Employee getEmployee(@RequestBody int id) {
		return employeeservice.getEmployee(id);
	}
	
//	@PostMapping(value="/updateEmp")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//	   return employeeservice.updateEmployee(employee.getId(), employee); 	
//	}
	
 

}