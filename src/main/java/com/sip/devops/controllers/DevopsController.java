package com.sip.devops.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sip.devops.entities.Devops;
import com.sip.devops.services.DevopsServices;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/devops")
public class DevopsController {
	
	@Autowired
	private DevopsServices devopsServices;

	@PostMapping(value = "/")
	public Devops addDevops(@RequestBody Devops devops) {
		return devopsServices.addDevops(devops);
	}

	@PutMapping(value = "/")
	public Devops updateDevops(@RequestBody Devops devops) {
		return devopsServices.updateDevops(devops);
	}

	@DeleteMapping(value="/{id}")
	public void deleteDevops(@PathVariable(name = "id")long id) {
		devopsServices.deleteDevops(id);
	}

	@GetMapping(value = "/")
	public List<Devops> findDevops() {
		return devopsServices.findDevops();
	}

}
