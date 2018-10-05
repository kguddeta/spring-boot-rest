package com.EmployeeService.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeService.model.Employee;
import com.EmployeeService.repository.EmployeeRepository;

@RestController
@RequestMapping("api/")
public class EmployeeController {
	@RequestMapping(value="employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		return EmployeeRepository.list();
	}
	
	@RequestMapping(value="employees/{id}",method =RequestMethod.GET)
	public Employee getEmployee(@PathVariable Long id) {
		return EmployeeRepository.list(id);
	}
	
	@RequestMapping(value="employees", method = RequestMethod.POST)
	public Employee create(@RequestBody Employee employee) {
		EmployeeRepository.create(employee);
		return employee;
	}
	@RequestMapping(value="employees/{id}", method = RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		EmployeeRepository.update(id, employee);
		return employee;
	}
}
