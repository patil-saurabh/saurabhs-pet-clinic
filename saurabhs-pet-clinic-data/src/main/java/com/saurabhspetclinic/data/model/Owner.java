package com.saurabhspetclinic.data.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person{

	private String address;
	
	private String city;
	
	private Set<Pet> pets = new HashSet<>();
	
	public Owner(Long id, String firstName, String lastName, String address, String city, Set<Pet> pets) {
		super.setId(id);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		
		this.address = address;
		
		this.city = city;
		this.pets = pets;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
