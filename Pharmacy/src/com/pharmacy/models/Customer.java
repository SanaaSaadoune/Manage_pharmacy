package com.pharmacy.models;

import java.util.ArrayList;

public class Customer extends Person{
	
	private int badge;
	
	public Customer(int id, String firstName, String lastName, int phoneNumber, String email, int badge) {
		super(id,firstName,lastName,phoneNumber,email);
		this.badge = badge;
	}

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}
	
	@Override
	public String toString() {
		return "Client : " +super.toString() + ", le badge : "+ this.badge +" achats.";
	}
	
	public static void AffichageCustomer(ArrayList<Customer> list) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getBadge() > 3) {
				System.out.println(list.get(i).toString() + "\n This client is loyal ! :) \n") ;
			}
			else {
				System.out.println(list.get(i).toString()) ;
			}
		}
	}
	
	public static boolean updateBadge(String firstName, String lastName,int phoneNumber, String email, ArrayList<Customer> list) {
		boolean exist=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getFirstName().equals(firstName) && list.get(i).getLastName().equals(lastName)&& list.get(i).getPhoneNumber() == phoneNumber && list.get(i).getEmail().equals(email)) {
				int badgeClient = list.get(list.get(i).getId()).getBadge();
				badgeClient = badgeClient+1;
				list.get(list.get(i).getId()).setBadge(badgeClient);
				exist= true;
			} 
			
		}
		return exist;
	}
	
	public static void addClient(String firstName, String lastName,int phoneNumber, String email, ArrayList<Customer> list)
	{
		int id = list.size();
		int badge = 1;
		Customer customer = new Customer(id,firstName,lastName,phoneNumber,email,badge);
		list.add(customer);
	}

}
