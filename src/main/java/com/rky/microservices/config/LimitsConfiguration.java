package com.rky.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="limit-service")
public class LimitsConfiguration {
	
	private int maxlimit;
	private int minLimit;
	
	public LimitsConfiguration() {}
	
	public LimitsConfiguration(int maxlimit, int minLimit) {
		super();
		this.maxlimit = maxlimit;
		this.minLimit = minLimit;
	}

	public int getMaxlimit() {
		return maxlimit;
	}

	public void setMaxlimit(int maxlimit) {
		this.maxlimit = maxlimit;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}
	
	

}
