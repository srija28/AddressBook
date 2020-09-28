package com.capgemini;

import java.io.*;
import java.util.*;

public class AddressBook {
	private List<Contact> addressBook = new ArrayList<Contact>();

	public void setAddressBook(List<Contact> l) {
		this.addressBook = l;
	}

	public List<Contact> getAddressBook() {
		return this.addressBook;
	}

	public void addContact(Contact contactObj) {
		addressBook.add(contactObj);
	}

	public List<Contact> viewContacts() {
		return addressBook;
	}
	public String updateContact(Contact s) {
		 int i=0;
		 for(Contact c: addressBook) {
			 if(c.firstname.equalsIgnoreCase(s.firstname) && c.lastname.equalsIgnoreCase(s.lastname)) {
			 addressBook.remove(c);
			 addressBook.add(s);
			 i++;
			 }
		 }
		 if(i==0)
			 return "No contact found with this name";
		 else
			 return "Contact Updated";
	 }

}
