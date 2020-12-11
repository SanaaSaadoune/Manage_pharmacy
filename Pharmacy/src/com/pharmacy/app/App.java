package com.pharmacy.app;
import java.util.Scanner;

import com.pharmacy.models.Customer;
import com.pharmacy.models.Medicine;
import com.pharmacy.models.Person;
import com.pharmacy.models.Pharmacist;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		ArrayList<Pharmacist> listPharmacists = new ArrayList<Pharmacist>();
		ArrayList<Medicine> listMedicines = new ArrayList<Medicine>();
		ArrayList<Customer> clientList = new ArrayList<Customer>();
		
		while(true) {
			System.out.println("Gestion des pharmaciens, medicaments ou vente ? (p/m/v)");
			char choice = reader.next().charAt(0);
			
			switch (choice) {
				case 'p': 
					System.out.println("add , edit , delete or search ? (a/e/d/s)");
					char meth = reader.next().charAt(0);
					
					switch (meth) {
						case 'a': 
							int id = listPharmacists.size();
							
							System.out.println("First name :");
							String firstName = reader.next();
							
							System.out.println("Last name :");
							String lastName = reader.next();
							
							System.out.println("Phone number :");
							int phoneNumber = reader.nextInt();
							
							System.out.println("Email :");
							String email = reader.next();
							
							Pharmacist.addPharmacist(id,firstName,lastName,phoneNumber,email, listPharmacists);
							
							Pharmacist.Affichage(listPharmacists);
							break;
							
						case 'e': 
							Pharmacist.Affichage(listPharmacists);
							
							System.out.println("Id pharmacist:");
							id = reader.nextInt();
							
							System.out.println("First name pharmacist:");
							firstName = reader.next();
							
							System.out.println("Last name pharmacist:");
							lastName = reader.next();
							
							System.out.println("Phone number pharmacist:");
							phoneNumber = reader.nextInt();
							
							System.out.println("Email pharmacist:");
							email = reader.next();
							
							Pharmacist.updatePharmacist(id,firstName,lastName,phoneNumber,email, listPharmacists);
							
							Pharmacist.Affichage(listPharmacists);
							break;			
							
						case 'd': 
							Pharmacist.Affichage(listPharmacists);
							
							System.out.println("Id pharmacist:");
							id = reader.nextInt();
							
							Pharmacist.deletePharmacist(id,listPharmacists);
							
							Pharmacist.Affichage(listPharmacists);
							break;
						
						case 's':
							System.out.println("Name pharmacist :");
							String name = reader.next();
							
							Pharmacist.searchPharmacist(name,listPharmacists);
							break;
							
						default :
							System.out.println("Error ! ");
							return;
					}
					break;
						
					
				case 'm':
					System.out.println("add , edit , delete or search ? (a/e/d/s)");
					char meth2 = reader.next().charAt(0);
					
					switch (meth2) {
						case 'a': 
							int id = listMedicines.size();
							
							System.out.println("Name medicine :");
							String name = reader.next();
							
							System.out.println("Description medicine :");
							String description = reader.next();
							
							System.out.println("Price medicine :");
							int price = reader.nextInt();
							
							
							Medicine.addMedicine(id,name,description,price, listMedicines);
							
							Medicine.Affichage(listMedicines);
							
							break;
						
						case 'e': 
							Medicine.Affichage(listMedicines);
							
							System.out.println("Id medicine :");
							id = reader.nextInt();
							
							System.out.println("Nom medicine :");
							name = reader.next();
							
							System.out.println("Description medicine :");
							description = reader.next();
							
							System.out.println("Price medicine :");
							price = reader.nextInt();
							
							Medicine.updateMedicine(id,name,description,price, listMedicines);
														
							Medicine.Affichage(listMedicines);
							
							break;
						
						case 'd': 
							Medicine.Affichage(listMedicines);
							
							System.out.println("Id medicine :");
							id = reader.nextInt();
							
							Medicine.deleteMedicine(id, listMedicines);
							
							Medicine.Affichage(listMedicines);
							
							break;
						
						case 's':
							System.out.println("Name medicine :");
							name = reader.next();
							
							Medicine.searchMedicine(name, listMedicines);
							
							break;
							
						default :
							System.out.println("Error ! ");
							return;
					}
					break;
					
					
				case 'v':
					int id = clientList.size();
					
					System.out.println("First name client :");
					String firstName = reader.next();
					
					System.out.println("Last name client :");
					String lastName = reader.next();
					
					System.out.println("Phone number client :");
					int phoneNumber = reader.nextInt();
					
					System.out.println("Email client :");
					String email = reader.next();
					
					if(Customer.updateBadge(firstName, lastName, phoneNumber, email, clientList))
						{
							Customer.AffichageCustomer(clientList);
							break;
						}
					else
					{
							Customer.addClient(firstName, lastName, phoneNumber, email, clientList);
					}
					
					Customer.AffichageCustomer(clientList);
					
					break;
				default :
					System.out.println("Error ! ");
					return;
					
			}
			
		}
		
	}

}