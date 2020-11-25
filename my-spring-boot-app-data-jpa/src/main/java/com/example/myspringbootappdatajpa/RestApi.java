package com.example.myspringbootappdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profile")
public class RestApi {

	@Autowired
	private ProfileService service;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Profile storeApi(@RequestBody Profile profile) {
		return service.createProfile(profile);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Profile> getAllProfiles()  {
		return service.getProfiles();
	}
	
}
