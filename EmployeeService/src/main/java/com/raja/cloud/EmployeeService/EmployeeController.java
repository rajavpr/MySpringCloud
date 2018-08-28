package com.raja.cloud.EmployeeService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EmployeeController {

	@Value("${employee.default.id}")
	String id;
	
	@Value("${employee.default.department}")
	String department;

	@Value("${employee.default.role}")
	String role;

	  
	@RequestMapping("/getdefaultvalues")
	public String getDefaultDetails() {
		return id+" "+department+" "+role;
	}
	
}
