package com.pharmacy.models;

import java.util.ArrayList;

public class Pharmacist extends Person{
	
	public Pharmacist(int id, String firstName, String lastName, int phoneNumber, String email) {
		super(id, firstName, lastName, phoneNumber, email);
	}


	@Override
	public String toString() {
		return "Pharmacien : "+super.toString();
	}
	
	public static void Affichage(ArrayList a) {
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i).toString());
		}
	}
	
	public static void addPharmacist(int id,String firstName, String lastName,int phoneNumber,String email, ArrayList<Pharmacist> list) {
		Pharmacist pharmacien1 = new Pharmacist(id,firstName,lastName,phoneNumber,email);
		list.add(pharmacien1);
	}
	
	public static void updatePharmacist(int id,String firstName, String lastName,int phoneNumber,String email, ArrayList<Pharmacist> list) {
		list.get(id).setFirstName(firstName);
		list.get(id).setLastName(lastName);
		list.get(id).setPhoneNumber(phoneNumber);
		list.get(id).setEmail(email);
	}
	
	public static void deletePharmacist(int id,ArrayList<Pharmacist> list)
	{
		list.remove(id);
	}
	
	public static void searchPharmacist(String name,ArrayList<Pharmacist> list)
	{
		for(int i=0;i<list.size();i++) {
			if (list.get(i).getLastName().equals(name)) {
				System.out.println(list.get(i).toString());
			}	
		}
		
	}
	
	
}
