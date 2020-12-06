package com.pharmacy.app;
import java.util.Scanner;
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
							
							Pharmacist pharmacien1 = new Pharmacist(id,firstName,lastName,phoneNumber,email);
							listPharmacists.add(pharmacien1);
							
							for(int i=0;i<listPharmacists.size();i++) {
								System.out.println(listPharmacists.get(i).toString());
							}
							break;
							
						case 'e': 
							for(int i=0;i<listPharmacists.size();i++) {
								System.out.println(listPharmacists.get(i).toString());
							}
							
							System.out.println("Id pharmacist:");
							int id1 = reader.nextInt();
							
							System.out.println("First name pharmacist:");
							String firstName1 = reader.next();
							
							System.out.println("Last name pharmacist:");
							String lastName1 = reader.next();
							
							System.out.println("Phone number pharmacist:");
							int phoneNumber1 = reader.nextInt();
							
							System.out.println("Email pharmacist:");
							String email1 = reader.next();
							
							listPharmacists.get(id1).setFirstName(firstName1);
							listPharmacists.get(id1).setLastName(lastName1);
							listPharmacists.get(id1).setPhoneNumber(phoneNumber1);
							listPharmacists.get(id1).setEmail(email1);
							
							for(int i=0;i<listPharmacists.size();i++) {
								System.out.println(listPharmacists.get(i).toString());
							}
							break;			
							
						case 'd': 
							for(int i=0;i<listPharmacists.size();i++) {
								System.out.println(listPharmacists.get(i).toString());
							}
							
							System.out.println("Id pharmacist:");
							int id3 = reader.nextInt();
							
							listPharmacists.remove(id3);
							
							for(int i=0;i<listPharmacists.size();i++) {
								System.out.println(listPharmacists.get(i).toString());
							}
							break;
						
						case 's':
							System.out.println("Name pharmacist :");
							String nom = reader.next();
							
							for(int i=0;i<listPharmacists.size();i++) {
								if (listPharmacists.get(i).getLastName().equals(nom)) {
									System.out.println(listPharmacists.get(i).toString());
								}	
							}
							
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
							int id4 = listMedicines.size();
							
							System.out.println("Name medicine :");
							String name = reader.next();
							
							System.out.println("Description medicine :");
							String description = reader.next();
							
							System.out.println("Price medicine :");
							int price = reader.nextInt();
							
							
							Medicine medicament = new Medicine(id4,name,description,price);
							listMedicines.add(medicament);
							
							for(int i=0;i<listMedicines.size();i++) {
								System.out.println(listMedicines.get(i).toString());
							}
							
							break;
						
						case 'e': 
							for(int i=0;i<listMedicines.size();i++) {
								System.out.println(listMedicines.get(i).toString());
							}
							
							System.out.println("Id medicine :");
							int id5 = reader.nextInt();
							
							System.out.println("Nom medicine :");
							String name2 = reader.next();
							
							System.out.println("Description medicine :");
							String description2 = reader.next();
							
							System.out.println("Price medicine :");
							int price2 = reader.nextInt();
							
							listMedicines.get(id5).setName(name2);
							listMedicines.get(id5).setDescription(description2);
							listMedicines.get(id5).setPrice(price2);
							
							
							for(int i=0;i<listMedicines.size();i++) {
								System.out.println(listMedicines.get(i).toString());
							}
							
							break;
						
						case 'd': 
							for(int i=0;i<listMedicines.size();i++) {
								System.out.println(listMedicines.get(i).toString());
							}
							
							System.out.println("Id medicine :");
							int id6 = reader.nextInt();
							
							listMedicines.remove(id6);
							
							for(int i=0;i<listMedicines.size();i++) {
								System.out.println(listMedicines.get(i).toString());
							}
							
							break;
						
						case 's':
							System.out.println("Name medicine :");
							String name3 = reader.next();
							
							for(int i=0;i<listMedicines.size();i++) {
								if (listMedicines.get(i).getName().equals(name3)) {
									System.out.println(listMedicines.get(i).toString());
								}
							}
							
							break;
							
						default :
							System.out.println("Error ! ");
							return;
					}
					break;
					
					
				case 'v':
					int id7 = clientList.size();
					
					System.out.println("First name client :");
					String firstName2 = reader.next();
					
					System.out.println("Last name client :");
					String lastName2 = reader.next();
					
					System.out.println("Phone number client :");
					int phoneNumber2 = reader.nextInt();
					
					System.out.println("Email client :");
					String email2 = reader.next();
					
					int badge = 1;
					int idClientExist = 0;
				
					boolean exist= false;
					for(int i=0;i<clientList.size();i++) {
						if(clientList.get(i).getFirstName().equals(firstName2) && clientList.get(i).getLastName().equals(lastName2)&& clientList.get(i).getPhoneNumber() == phoneNumber2 && clientList.get(i).getEmail().equals(email2)) {
							exist = true;
							idClientExist = i;
						} 
					}
					
					if(exist == true) {
						int badgeClient = clientList.get(idClientExist).getBadge();
						badgeClient = badgeClient+1;
						clientList.get(idClientExist).setBadge(badgeClient);
					}
					
					else {
						Customer customer = new Customer(id7,firstName2,lastName2,phoneNumber2,email2,badge);
						clientList.add(customer);
					}
					
					
					for(int i=0;i<clientList.size();i++) {
						if(clientList.get(i).getBadge() > 3) {
							System.out.println(clientList.get(i).toString() + "\n This client is loyal ! :) \n") ;
						}
						else {
							System.out.println(clientList.get(i).toString()) ;
						}
					}
					
					break;
				default :
					System.out.println("Error ! ");
					return;
					
			}
			
		}
		
	}

}