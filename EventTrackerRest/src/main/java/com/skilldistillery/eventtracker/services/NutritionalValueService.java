package com.skilldistillery.eventtracker.services;

import java.util.List;
import java.util.Optional;

import com.skilldistillery.eventtracker.entities.NutritionalValue;

public interface NutritionalValueService {

	List<NutritionalValue> getAll();
	Optional<NutritionalValue> showOne(int id);
	Boolean deleteFood(int nid);
	NutritionalValue createNewFood(NutritionalValue nv);
	NutritionalValue replaceFood(NutritionalValue nv, Integer nid);
	NutritionalValue updateFood(NutritionalValue nutritionalValue, Integer nid);

}
