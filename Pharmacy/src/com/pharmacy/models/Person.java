package com.pharmacy.models;

import java.util.ArrayList;

public class Person {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private int phoneNumber;
	
	private String email;
	
	
	
	
	public Person(int id, String firstName, String lastName, int phoneNumber, String email) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber= phoneNumber;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "L'id : " + this.id +", Le nom : " + this.firstName + " "+ this.lastName +", le numéro de téléphone : "+ this.phoneNumber + ", l'email : "+ this.email;
	}
	
	
}
