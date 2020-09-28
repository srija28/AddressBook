package com.capgemini;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook a = new AddressBook();

		System.out.println("Welcome to the Address Book");
		System.out.println("Enter the First Name: ");
		String first = sc.nextLine();
		System.out.println("Enter the Last Name: ");
		String last = sc.nextLine();
		System.out.println("Enter the Address: ");
		String add = sc.nextLine();
		System.out.println("Enter the City: ");
		String city = sc.nextLine();
		System.out.println("Enter the State: ");
		String st = sc.nextLine();
		System.out.println("Enter the Zip: ");
		Long zip = sc.nextLong();
		System.out.println("Enter the Phone Number: ");
		String ph = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the Email: ");
		String email = sc.nextLine();
		Contact c = new Contact(first, last, add, city, st, zip, ph, email);
		a.addContact(c);

		List<Contact> o = new ArrayList<Contact>();
		o = a.viewContacts();
		System.out.println("The Contact in Address Book is: ");
		for (Contact i : o) {
			System.out.println(i);
		}
		System.out.println("Üpdate Contact:");
		System.out.println("Enter name and all details:");
		System.out.println("Enter the First Name: ");
		String u_first = sc.nextLine();
		System.out.println("Enter the Last Name: ");
		String u_last = sc.nextLine();
		System.out.println("Enter the Address: ");
		String u_add = sc.nextLine();
		System.out.println("Enter the City: ");
		String u_city = sc.nextLine();
		System.out.println("Enter the State: ");
		String u_st = sc.nextLine();
		System.out.println("Enter the Zip: ");
		Long u_zip = sc.nextLong();
		System.out.println("Enter the Phone Number: ");
		String u_ph = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the Email: ");
		String u_email = sc.nextLine();
		
		Contact update = new Contact(u_first, u_last, u_add, u_city, u_st, u_zip, u_ph, u_email);
		String s = a.updateContact(update);
		System.out.println(s);
		
		List<Contact> con = new ArrayList<Contact>();
		con=a.viewContacts();
		System.out.println("The new Contact in Address Book is: ");
		for(Contact i:con) {
			System.out.println(i);
		}
		

	}
}
