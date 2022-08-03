package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empController {
	@GetMapping("/employee")
	public Employeedetails  getEmployeedetails()
	{
return new Employeedetails("praveen","manager",001);
}
	@GetMapping("/employees")
	public List<Employeedetails> getEmployeedetailslist()
	{
		List<Employeedetails>employees=new ArrayList<>();
		employees.add(new Employeedetails("Prem","kumar",10));
		employees.add(new Employeedetails("Ram","kumar",05));
		employees.add(new Employeedetails("Tharun","kumar",04));
		employees.add(new Employeedetails("Nandhaa","kumar",03));
		return employees;
	}
	
}
