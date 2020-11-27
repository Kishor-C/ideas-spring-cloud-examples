package com.example.configclientdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client-api")

public class RestApi {

	@Autowired
	private EmployeeRepository employeeDao;
	
	@Autowired
	private DatasourceConfig config;

	@GetMapping
	public String getPropertiesFromConfigServer() {
		return config.toString();
	}
	
	@GetMapping("{empId}")
	public Employee getEmployee(@PathVariable("empId") int id) {
		return employeeDao.findById(id).get();
	}
}
