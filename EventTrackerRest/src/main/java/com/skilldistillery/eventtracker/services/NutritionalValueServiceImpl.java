package com.skilldistillery.eventtracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.eventtracker.entities.NutritionalValue;
import com.skilldistillery.eventtracker.repositories.NutritionalValueRepository;

@Service
public class NutritionalValueServiceImpl implements NutritionalValueService {
	
	@Autowired
	private NutritionalValueRepository nvRepo;
	
	@Override
	public List<NutritionalValue> getAll() {
		return nvRepo.findAll();
	}

	@Override
	public Optional<NutritionalValue> showOne(int id) {
		return nvRepo.findById(id);
	}
	
	@Override
	public NutritionalValue createNewFood (NutritionalValue nv) {
		
		return nvRepo.saveAndFlush(nv);
	}
	
	@Override
	public Boolean deleteFood(int nid) {
		try {
			nvRepo.deleteById(nid);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public NutritionalValue replaceFood(NutritionalValue nv, Integer nid) {
		
		Optional<NutritionalValue> nutritionVal = nvRepo.findById(nid);
		
		if (nutritionVal.isPresent()) {
			NutritionalValue nutritional = nutritionVal.get();
			nutritional.setNameAndAmount(nv.getNameAndAmount());
			nutritional.setCalories(nv.getCalories());
			nutritional.setCaloriesFromFat(nv.getCaloriesFromFat());
			nutritional.setSaturatedFat(nv.getSaturatedFat());
			nutritional.setTransFat(nv.getTransFat());
			nutritional.setCholesterol(nv.getCholesterol());
			nutritional.setSodium(nv.getSodium());
			nutritional.setPotassium(nv.getPotassium());
			nutritional.setTotalCarbohydrate(nv.getTotalCarbohydrate());
			nutritional.setDietaryFiber(nv.getDietaryFiber());
			nutritional.setSugars(nv.getSugars());
			nutritional.setProtein(nv.getProtein());
			
			return nvRepo.saveAndFlush(nutritional);
		}
		
		return null;
	}
	
	@Override
	public NutritionalValue updateFood(NutritionalValue nutritionalValue, Integer nid) {
		
		Optional<NutritionalValue> nutritionVal = nvRepo.findById(nid);
		
		if (nutritionVal.isPresent()) {
			NutritionalValue nv = nutritionVal.get();
			
			if( nutritionalValue.getNameAndAmount() != null && !nutritionalValue.getNameAndAmount().equals("")) {
				nv.setNameAndAmount(nv.getNameAndAmount());
			}
			if( nutritionalValue.getCalories() != null && !(nutritionalValue.getCalories() == nv.getCalories())) {
				nv.setCalories(nv.getCalories());
			}
			if( nutritionalValue.getCaloriesFromFat() != null && !(nutritionalValue.getCaloriesFromFat() == nv.getCaloriesFromFat())) {
				nv.setCaloriesFromFat(nv.getCaloriesFromFat());
			}
			if( nutritionalValue.getSaturatedFat() != null && !(nutritionalValue.getSaturatedFat() == nv.getSaturatedFat())) {
				nv.setSaturatedFat(nv.getSaturatedFat());
			}
			if( nutritionalValue.getTransFat() != null && !(nutritionalValue.getTransFat() == nv.getTransFat())) {
				nv.setTransFat(nv.getTransFat());
			}
			if( nutritionalValue.getCholesterol() != null && !(nutritionalValue.getCholesterol() == nv.getCholesterol())) {
				nv.setCholesterol(nv.getCholesterol());
			}
			if( nutritionalValue.getSodium() != null && !(nutritionalValue.getSodium() == nv.getSodium())) {
				nv.setSodium(nv.getSodium());
			}
			if( nutritionalValue.getPotassium() != null && !(nutritionalValue.getPotassium() == nv.getPotassium())) {
				nv.setPotassium(nv.getPotassium());
			}
			if( nutritionalValue.getTotalCarbohydrate() != null && !(nutritionalValue.getTotalCarbohydrate() == nv.getTotalCarbohydrate())) {
				nv.setTotalCarbohydrate(nv.getTotalCarbohydrate());
			}
			if( nutritionalValue.getDietaryFiber() != null && !(nutritionalValue.getDietaryFiber() == nv.getDietaryFiber())) {
				nv.setDietaryFiber(nv.getDietaryFiber());
			}
			if( nutritionalValue.getSugars() != null && !(nutritionalValue.getSugars() == nv.getSugars())) {
				nv.setSugars(nv.getSugars());
			}
			if( nutritionalValue.getProtein() != null && !(nutritionalValue.getProtein() == nv.getProtein())) {
				nv.setProtein(nv.getProtein());
			}
			
			return nvRepo.saveAndFlush(nv);
		}
		return null;
	}
	
	
}
