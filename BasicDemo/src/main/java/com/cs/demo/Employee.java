package com.cs.demo;

public class Employee {
	
	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println(address.toString());
	}
	
	

}
