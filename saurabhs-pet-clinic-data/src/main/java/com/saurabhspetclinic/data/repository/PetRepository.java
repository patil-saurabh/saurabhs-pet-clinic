package com.saurabhspetclinic.data.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.saurabhspetclinic.data.model.Pet;

public interface PetRepository<S, R> extends CrudRepository<Pet, Long> {

	@Override
	default <S extends Pet> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Optional<Pet> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Iterable<Pet> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void delete(Pet entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll(Iterable<? extends Pet> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
}
