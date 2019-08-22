package com.example.mylearning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping("company/{companyName}/allemployee")
	public List<Employee> getAllEmployee(@PathVariable String companyName) {
		return employeeservice.getAllCompany(companyName);
	}
	
	
	@RequestMapping("/company/{companyName}/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return employeeservice.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/company/{companyName}/employee")
	public void addEmployee(@RequestBody Employee employee, @PathVariable String companyName) {
		employee.setCompany(new Company(0,companyName,"",""));
		employeeservice.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/company/{companyName}/employee/{id}")
	public void updateEmployee(@RequestBody Employee employee,  @PathVariable String companyName, @PathVariable String id) {
		employee.setCompany(new Company(0,companyName,"",""));
		employeeservice.updateEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/company/{companyName}/employee/{id}")
	public void deleteCompany (@PathVariable String id) {
		employeeservice.deleteCompany(id);
	}
}
