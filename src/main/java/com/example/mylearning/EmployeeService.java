package com.example.mylearning;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;
		
	public List<Employee> getAllCompany(String companyName) {
		List<Employee> employees = new ArrayList<>();
		employeerepository.findByCompanyName(companyName)
		.forEach(employees::add);
		return employees;
	}
	
	public Employee getEmployee(String id) {
		return employeerepository.findById(id).orElse(null);
	}

	public void addEmployee(Employee employee) {
		employeerepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		employeerepository.save(employee);
	}

	public void deleteCompany(String id) {
		employeerepository.deleteById(id);
	}
	
}
