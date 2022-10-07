package com.ddlab.rnd.service;

import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.Employee;

@Service
public class EmployeeService {

	public String createEmployee(Employee emp) {
		System.out.println("Emp: " + emp);
		return "Employee created successfully ...";
	}
	
	public String getEmpNameById(int id) {
		return "John Abraham";
	}
	
	public Employee getEmployeeById(int id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName("Jyotika Sadana");
		return emp;
	}
	
	public String updateEmp(Employee emp) {
		Employee emp1 = new Employee();
		emp1.setId(emp.getId());
		emp1.setName("Viday Balan");
		
		return "Name changed successfully ...";
	}

}
