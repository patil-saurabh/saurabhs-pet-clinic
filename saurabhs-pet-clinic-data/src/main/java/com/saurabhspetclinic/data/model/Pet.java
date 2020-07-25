package com.saurabhspetclinic.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pet {
	
	@Id
	private Long id;
	
	private String name;
	
	private String animalType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", animalType=" + animalType + "]";
	}
	
	
	
}
