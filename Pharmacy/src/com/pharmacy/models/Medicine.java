package com.pharmacy.models;

import java.util.ArrayList;

public class Medicine {
	private int id;
	private String name;
	private String description;
	private double price;
	
	public Medicine(int id, String name, String description, double price)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "L'id : " + this.id +", Le nom : " + this.name + ", La description : "+ this.description +", Le prix : "+ this.price + "\n";
	}
	
	
	public static void Affichage(ArrayList a) {
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i).toString());
		}
	}
	
	public static void addMedicine(int id,String name, String description,double price, ArrayList<Medicine> list) {
		Medicine medicament = new Medicine(id,name,description,price);
		list.add(medicament);
	}
	
	public static void updateMedicine(int id,String name, String description,double price, ArrayList<Medicine> list) {
		list.get(id).setName(name);
		list.get(id).setDescription(description);
		list.get(id).setPrice(price);
	}
	
	public static void deleteMedicine(int id,ArrayList<Medicine> list)
	{
		list.remove(id);
	}
	
	public static void searchMedicine(String name,ArrayList<Medicine> list)
	{
		for(int i=0;i<list.size();i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println(list.get(i).toString());
			}	
		}
		
	}

}
