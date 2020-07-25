package com.saurabhspetclinic.data.storage.map;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.saurabhspetclinic.data.model.Owner;
import com.saurabhspetclinic.data.model.Pet;
import com.saurabhspetclinic.data.model.Vet;

/**
 * Idea is this class will store all the maps with all the data. Need to think about making the data access threadsafe.
 * 
 * @author Saurabh
 *
 * @param <Obj>
 */
@Component
public class DataMaps<Obj extends Object> {
	
	private Map<Long, Owner> ownerMap = new HashMap<>();
	
	private Map<Long, Pet> petMap = new HashMap<>();
	
	private Map<Long, Vet> vetMap = new HashMap<>();
	
	private Map<Long, Obj> visitMap = new HashMap<>();

	public Map<Long, Owner> getOwnerMap() {
		return ownerMap;
	}

	public void setOwnerMap(Map<Long, Owner> ownerMap) {
		this.ownerMap = ownerMap;
	}

	public Map<Long, Pet> getPetMap() {
		return petMap;
	}

	public void setPetMap(Map<Long, Pet> petMap) {
		this.petMap = petMap;
	}

	public Map<Long, Vet> getVetMap() {
		return vetMap;
	}

	public void setVetMap(Map<Long, Vet> vetMap) {
		this.vetMap = vetMap;
	}

	public Map<Long, Obj> getVisitMap() {
		return visitMap;
	}

	public void setVisitMap(Map<Long, Obj> visitMap) {
		this.visitMap = visitMap;
	}
	
}
