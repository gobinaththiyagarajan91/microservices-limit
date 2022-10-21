package com.microservices.limitservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservice.configuration.Configuration;
import com.microservices.limitservice.pojo.Limit;

@RestController
@RequestMapping("ms")
public class LimitController {
	
	@Autowired
	private Configuration config;
	
	
	@GetMapping("limits")
	public Limit getLimit() {
		
		return new Limit(config.getMinimum(), config.getMaximum());
	}
	

}
