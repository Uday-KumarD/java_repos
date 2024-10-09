package com.demo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="one_student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stid;
	private String stname;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL,fetch=FetchType.EAGER)
	private Address address;

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int stid, String stname, Address address) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.address = address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", address=" + address + "]";
	}
	
	
	
}
