package com.capgemini;

public class Contact {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	long zip;
	String phonenumber;
	String email;

	public Contact(String firstname, String lastname, String address, String city, String state, long zip,
			String phonenumber, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phonenumber = phonenumber;
		this.email = email;
	}

}
