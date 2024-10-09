package com.jpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empid;
	private String empname;
	private String empadd;
	private int empsal;
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
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public Employee(int empid, String empname, String empadd, int empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empadd = empadd;
		this.empsal = empsal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empadd=" + empadd + ", empsal=" + empsal + "]";
	}
	
	
	

}
