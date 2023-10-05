package com.employee.service;
import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;



public interface EmployeeService {
Employee createEmployee(Employee employee);
   List <Employee> getAllEmployee();
   Optional<Employee> getEmployee();
   Employee updateEmployee(int id,Employee employee);
   void deleteEmployee(int id);
   Employee getEmployee(int id);

 

}
