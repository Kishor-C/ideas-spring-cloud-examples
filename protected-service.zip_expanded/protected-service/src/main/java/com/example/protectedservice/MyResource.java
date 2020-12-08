package com.example.protectedservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyResource {

	@PostMapping(value = "store")
	public String storeApi() {
		return "Store API";
	}
	@GetMapping(value = "fetch")
	public String getApi() {
		return "Get API";
	}
	@PutMapping(value = "update")
	public String updateApi() {
		return "Update API";
	}
	@DeleteMapping(value = "delete")
	public String deleteApi() {
		return "Delete API";
	}
}
