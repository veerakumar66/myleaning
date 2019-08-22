package com.example.mylearning;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyservice;
	
	@RequestMapping("/allcompanies")
	public List<Company> getAllCompanies() {
		return companyservice.getAllCompany();
	}
	
	
	@RequestMapping("/company/{name}")
	public Company getCompany(@PathVariable String name) {
		return companyservice.getCompany(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/company")
	public void addCompany(@RequestBody Company company) {
		companyservice.addCompany(company);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/company/{name}")
	public void updateCompany(@RequestBody Company company, @PathVariable String name) {
		companyservice.updateCompany(company);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/company/{name}")
	public void deleteCompany(@PathVariable String name) {
		companyservice.deleteCompany(name);
	}
}
