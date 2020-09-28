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

}
