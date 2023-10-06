package com.employee.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
//@CrossOrigin(origins = {"http://localhost:5173"})
@RequestMapping(value="/empdata")
public class EmployeeController {
    @Autowired
EmployeeService employeeservice;
	@PostMapping(value="/create")
     public Employee createEmployee(@RequestBody Employee employee){
//		try {
//		Thread.sleep(10000);
//		}catch(InterruptedException e){
//			System.out.println(e);
//		}
//		System.out.println("fetched");
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
	
	@DeleteMapping("/deleteEmp/{id}")
	public void deleteEmployees(@PathVariable("id") int id){
		
		employeeservice.deleteEmployee(id); 
	}
	
	@GetMapping("/getEmp/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeservice.getEmployee(id);
	}
	
	@PutMapping(value="/updateEmp/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
	   return employeeservice.updateEmployee(id, employee); 	
	}
	
 

}