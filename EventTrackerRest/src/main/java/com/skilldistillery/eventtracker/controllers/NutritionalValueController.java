package com.skilldistillery.eventtracker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.eventtracker.entities.NutritionalValue;
import com.skilldistillery.eventtracker.services.NutritionalValueService;

@RestController
@RequestMapping("api")
public class NutritionalValueController {
	
	@Autowired
	private NutritionalValueService nvServ;
	
	@RequestMapping(path="nutritionalvalues", method = RequestMethod.GET)
	public List<NutritionalValue> index() {
		return nvServ.getAll();
	}
	
	@RequestMapping(path="nutritionalvalues/{nid}")
	public Optional<NutritionalValue> show(@PathVariable int nid) {
		return nvServ.showOne(nid);
	}

	
}
