package com.skilldistillery.eventtracker.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.eventtracker.entities.NutritionalValue;
import com.skilldistillery.eventtracker.services.NutritionalValueService;

@RestController
@RequestMapping("api")
@CrossOrigin({"*", "http://localhost:4200"})
public class NutritionalValueController {

	@Autowired
	private NutritionalValueService nvServ;

	@RequestMapping(path = "nutritionalvalues", method = RequestMethod.GET)
	public List<NutritionalValue> index() {
		return nvServ.getAll();
	}

	@RequestMapping(path = "nutritionalvalues/{nid}")
	public Optional<NutritionalValue> show(@PathVariable int nid) {
		return nvServ.showOne(nid);
	}

	@RequestMapping(path = "nutritionalvalues", method = RequestMethod.POST)
	public NutritionalValue create(@RequestBody NutritionalValue nutritionVal, HttpServletResponse resp) {

		NutritionalValue nv = nvServ.createNewFood(nutritionVal);

		if (nv == null) {
			resp.setStatus(500);
		} else {
			resp.setStatus(201);
		}

		return nv;
	}

	@RequestMapping(path = "nutritionalvalues/{fid}", method = RequestMethod.PUT)
	public NutritionalValue replace(@PathVariable Integer fid, @RequestBody NutritionalValue nv) {
		return nvServ.replaceFood(nv, fid);
	}

	@RequestMapping(path = "nutritionalvalues/{fid}", method = RequestMethod.DELETE)
	public Boolean deleteFood(@PathVariable int fid, HttpServletResponse resp) {

		Boolean deleted = nvServ.deleteFood(fid);

		if (deleted) {
			resp.setStatus(200);
		} else {
			resp.setStatus(404);
		}
		return deleted;
	}

	@RequestMapping(path = "nutritionalvalues/{fid}", method = RequestMethod.PATCH)
	public NutritionalValue update(@PathVariable int fid, @RequestBody NutritionalValue nv) {
		return nvServ.updateFood(nv, fid);
	}

}
