package com.capgemini;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook a = new AddressBook();
		while (true) {
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
		}

	}
}
