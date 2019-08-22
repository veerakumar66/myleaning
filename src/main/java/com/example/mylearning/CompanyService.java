package com.example.mylearning;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyrepository;
		
	public List<Company> getAllCompany() {
		List<Company> companies = new ArrayList<>();
		companyrepository.findAll()
		.forEach(companies::add);
		return companies;
	}
	
	public Company getCompany(String name) {
		return companyrepository.findById(name).orElse(null);
	}

	public void addCompany(Company company) {
		companyrepository.save(company);
	}

	public void updateCompany(Company company) {
		companyrepository.save(company);
	}

	public void deleteCompany(String name) {
		companyrepository.deleteById(name);
	}
	
}
