package com.EmployeeService.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.EmployeeService.model.Employee;

public class EmployeeRepository {
	static Map<Long,Employee> employees = new HashMap<Long, Employee>();
	static Long index =3L;
	static {
		employees.put(1L,new Employee(1L,"Abebe","Balcha",3500));
		employees.put(2L,new Employee(2L,"Jems","David",4500));
		employees.put(3L,new Employee(3L,"Harambe","Theodros",5500));
	}

	
	public static List<Employee> list(){
		return new ArrayList<Employee>(employees.values());
	}
	
	public static Employee list(Long id) {
		return employees.get(id);
	}
	
	public static Employee create(Employee employee) {
		index++;
		employee.setId(index);
		employees.put(index,employee);
		return employee;
	}
	
	public static Employee update(Long id, Employee employee) {
		employee.setId(id);
		employees.put(id,  employee);
		return employee;
	}
}
