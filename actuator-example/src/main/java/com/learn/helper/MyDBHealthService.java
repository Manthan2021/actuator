package com.learn.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHealthService implements HealthIndicator{

	public boolean isHealthGood() {
		//custom logic
		return false;
	}
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		if(isHealthGood()) {
		return Health.up().withDetail("DB_Service","Database Service is running").build();
	}
		return Health.down().withDetail("DB_Service","Database Service is Running Down").build();

}
}
