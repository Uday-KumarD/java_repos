package com.demo;

public class Employee {

	private int empid;
	private String empname;
	private int empsal;
	private String empadd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	
	public void display()
	{
		System.out.println(empid+" "+empname+" "+empsal+" "+empadd);
	}
	
	
	
}
