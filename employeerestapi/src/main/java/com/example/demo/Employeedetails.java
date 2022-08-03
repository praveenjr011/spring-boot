package com.example.demo;

public class Employeedetails {
	private String Employeename;
	private String Employeedesign;
	private int Empid;
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public String getEmployeedesign() {
		return Employeedesign;
	}
	public void setEmployeedesign(String employeedesign) {
		Employeedesign = employeedesign;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public Employeedetails(String employeename, String employeedesign, int empid) {
		super();
		Employeename = employeename;
		Employeedesign = employeedesign;
		Empid = empid;
	}
	
	

}
