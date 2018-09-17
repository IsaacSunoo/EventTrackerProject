package com.skilldistillery.eventtracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.eventtracker.entities.NutritionalValue;

public interface NutritionalValueRepository extends JpaRepository<NutritionalValue, Integer>{
	

}
