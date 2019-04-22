package com.rky.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rky.microservices.config.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitsConfiguration configuration;
	
	
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfigurations() {
		
		LimitsConfiguration limitsConfiguration = new LimitsConfiguration(configuration.getMaxlimit(), configuration.getMinLimit());
		return limitsConfiguration;
	}
	
}
