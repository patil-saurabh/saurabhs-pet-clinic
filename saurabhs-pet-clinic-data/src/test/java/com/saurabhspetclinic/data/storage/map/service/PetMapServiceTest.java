package com.saurabhspetclinic.data.storage.map.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.saurabhspetclinic.data.model.Dog;
import com.saurabhspetclinic.data.model.Pet;
import com.saurabhspetclinic.data.storage.map.DataMaps;

public class PetMapServiceTest {

	public static PetMapService<Pet> petMapServiceTestObj;
	
	@BeforeAll
	public static void initialize() {
		petMapServiceTestObj = new PetMapService<Pet>(new DataMaps<>());
		//petMapServiceTestObj.setDataMaps(new DataMaps<>());
	}
	
	@Test
	public void allOperationsTest() {
		
		Pet dog = new Dog();
		dog.setId(1234L);
		dog.setName("Moti");
		dog.setAnimalType("Dog");
		
		Pet dog2 = new Dog();
		dog2.setId(9876L);
		dog2.setName("Tingu");
		dog2.setAnimalType("Dog");
		
		petMapServiceTestObj.save(dog);
		petMapServiceTestObj.save(dog2);
		
		System.out.println("Find All : "+ petMapServiceTestObj.findAll());
		
		petMapServiceTestObj.delete(dog);
		System.out.println(" Deleted a dog.. ");
		
		System.out.println("Find All : "+ petMapServiceTestObj.findAll());
		
		System.out.println("Find by ID 9876L: " + petMapServiceTestObj.findById(9876L));
		
	}
		
}
