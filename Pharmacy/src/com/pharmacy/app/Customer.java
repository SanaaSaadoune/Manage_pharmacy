package com.pharmacy.app;

public class Customer extends Pharmacist{
	
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
		return super.toString() + ", le badge : "+ this.badge +" achats.";
	}

}
