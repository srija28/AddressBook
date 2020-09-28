package com.capgemini;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<AddressBook> book = new ArrayList<AddressBook>();
		System.out.println("How many address books do you want to make: ");
		int b = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < b; i++) {

			System.out.println("Enter name of address book for book no " + (i + 1) + " :");
			String aname = sc.nextLine();
			AddressBook a = new AddressBook(aname);

			book.add(a);
		}

		int n = 5;
		System.out.println("Welcome to the Address Book");
		do {
			System.out
					.println("Menu \n1.Add contact \n2.Edit Contact \n3.Delete contact \n4.View all contacts \n5.Exit");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String addname1 = sc.nextLine();
				System.out.println("Enter the First Name: ");
				String first = sc.nextLine();
				sc.nextLine();
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
				for (AddressBook j : book) {
					if (j.bookname.equalsIgnoreCase(addname1)) {
						j.addContact(c);
					} else
						continue;
				}
				break;
			case 2:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String addname2 = sc.nextLine();
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
				String s = "";
				for (AddressBook j : book) {
					if (j.bookname.equalsIgnoreCase(addname2)) {
						s = j.updateContact(update);
					} else
						continue;
				}

				System.out.println(s);
				break;

			case 3:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String addname3 = sc.nextLine();
				System.out.println("Enter the first name of contact to remove: ");
				sc.nextLine();
				String f = sc.nextLine();
				System.out.println("Enter the last name of contact to remove: ");
				String l = sc.nextLine();
				boolean t = false;
				for (AddressBook x : book) {
					if (x.bookname.equalsIgnoreCase(addname3)) {
						t = x.removeContact(f, l);
					} else
						continue;
				}

				if (t)
					System.out.println("Contact removed");
				else
					System.out.println("Contact not found");
				break;
			case 4:
				System.out.println("Enter name of address book: ");
				sc.nextLine();
				String addname4 = sc.nextLine();

				List<Contact> o = new ArrayList<Contact>();
				for (AddressBook x : book) {
					if (x.bookname.equalsIgnoreCase(addname4)) {
						o = x.viewContacts();
					} else
						continue;
				}

				System.out.println("The Contact in Address Book is: ");
				for (Contact m : o) {
					System.out.println(m);
				}
				break;
			case 5:
				break;
			}
		} while (n != 5);

	}
}
