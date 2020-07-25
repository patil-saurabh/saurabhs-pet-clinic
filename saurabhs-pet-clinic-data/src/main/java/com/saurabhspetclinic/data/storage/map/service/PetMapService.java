package com.saurabhspetclinic.data.storage.map.service;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabhspetclinic.data.model.Pet;
import com.saurabhspetclinic.data.storage.map.DataMaps;

@Service
public class PetMapService <P extends Pet> {
	
	@Autowired
	private DataMaps<Object> dataMaps;
	
	private Map<Long, Pet> petMap;

	
	public PetMapService(DataMaps<Object> dataMaps){
		this.dataMaps = dataMaps;
		petMap = dataMaps.getPetMap();
	}
	
	//TODO: make this class and all methods thread safe
	
	public void save(P pet) {
		petMap.put(pet.getId(), pet);
	}
	
	public boolean delete(P pet) {
		Pet removedPet = petMap.remove(pet.getId());
		return (removedPet == null)? false : true;
	}
	
	public Collection<Pet> findAll(){
		return petMap.values();
	}
	
	@SuppressWarnings("unchecked")
	public P findById(Long id) {
		return (P) petMap.get(id);
	}

	public DataMaps<Object> getDataMaps() {
		return dataMaps;
	}

	public void setDataMaps(DataMaps<Object> dataMaps) {
		this.dataMaps = dataMaps;
	}
	
}
