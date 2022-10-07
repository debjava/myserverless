package com.ddlab.rnd.fn;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.Employee;
import com.ddlab.rnd.service.EmployeeService;

@Component
public class EmployeeFunction {

	@Autowired
	private EmployeeService empService;

	@Bean // POST http://localhost:8080/createEmp , Http Response code: 202 - Accepted
	public Consumer<Employee> createEmp() {
		return emp -> empService.createEmployee(emp);
	}

	@Bean // GET http://localhost:8080/getNameById/23
	public Function<Integer, String> getNameById() {
		return idValue -> empService.getEmpNameById(idValue);
	}

	@Bean // GET http://localhost:8080/getEmployeeById/23
	public Function<Integer, Employee> getEmployeeById() {
		return idValue -> empService.getEmployeeById(idValue);
	}
	
	@Bean // GET http://localhost:8080/getTotalEmp
	public Supplier<String> getTotalEmp() {
		return () -> "Total: 50";
	}
	
	@Bean // POST http://localhost:8080/updateEmpName
	public Function<Employee, String> updateEmpName() {
		return emp -> empService.updateEmp(emp);
	}
	
	

}
