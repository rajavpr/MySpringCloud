package com.raja.cloud.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class EmployeeController {

	@Value("${employee.default.id}")
	String id;
	
	@Value("${employee.default.department}")
	String department;

	@Value("${employee.default.role}")
	String role;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	AddressClient addressClient;
	  
	@RequestMapping("/getdefaultvalues")
	public String getDefaultDetails() {
		
/*		ResponseEntity<String> response = restTemplate.getForEntity("http://AddressService/address", String.class);
		
		System.out.println(response.getStatusCode()+" " + response.getStatusCodeValue());
		
		return id+" "+department+" "+role+response.getBody();
*/
		
		return id+" "+department+" "+role+addressClient.getAddress();
		
	}
	
}
