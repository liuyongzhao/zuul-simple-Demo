package com.lyz.demo.simpleGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoZuulSimpleBookApplication {
	
		@RequestMapping(value = "/available")
	    public String available() {
			System.out.println("Spring in Action");
	        return "Spring in Action";
	    }

	    @RequestMapping(value = "/checked-out")
	    public String checkedOut() {
	        return "Spring Boot in Action";
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoZuulSimpleBookApplication.class, args);
	}
}
