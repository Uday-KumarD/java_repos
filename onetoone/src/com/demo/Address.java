package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="one_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int add_id;
	private String colony;
	private String state;
	private int pincode;
	
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address(int add_id, String colony, String state, int pincode) {
		super();
		this.add_id = add_id;
		this.colony = colony;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [add_id=" + add_id + ", colony=" + colony + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
}
