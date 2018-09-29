package com.raja.cloud.EmployeeGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class EmployeeGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeGateWayApplication.class, args);
	}
}
