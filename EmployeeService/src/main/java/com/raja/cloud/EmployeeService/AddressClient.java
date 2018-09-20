package com.raja.cloud.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@Service
public class AddressClient {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getDefaultAdress")
	public String getAddress() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://AddressService/address", String.class);
		return response.getBody();
	}
	
	public String getDefaultAdress() {
		return "Namakkal";
	}
	
}
