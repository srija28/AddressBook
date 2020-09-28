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
		 Contact m = new Contact("", "", "", "", "", 0, "", "");
		 Contact n = new Contact("", "", "", "", "", 0, "", "");
		
		 for(Contact x: addressBook) {
			 if(x.firstname.equalsIgnoreCase(s.firstname) && x.lastname.equalsIgnoreCase(s.lastname)) {
				 n=x;
			 m=s;
			 i++;
			 }
		 }
		 if(i==0)
			 return "No contact found with this name";
		 else {
			 addressBook.remove(n);
			 addressBook.add(m);
			 return "Contact Updated";
		 }
			
	 }
	public boolean removeContact(String firstname, String lastname) {
		 Contact s=new Contact("","","", "", "", 0,"", "");
		 for(Contact x:addressBook) {
			 if(x.firstname.equalsIgnoreCase(firstname) && x.lastname.equalsIgnoreCase(lastname)) {
				 s=x;
			 }
		 }
		 return addressBook.remove(s);
	 }

}
