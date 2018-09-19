package com.raja.cloud.AddressService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	@RequestMapping(path="/address", method=RequestMethod.GET)
	public String getAddress() {
	System.out.println(">>>>>>>>>>>>>>>>>>>> Address Service invoked");
		return "Bangalore";
	}
	
	
}
