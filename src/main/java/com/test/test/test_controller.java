package com.test.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test_controller {
	
	@GetMapping("/welcome")
	public String welcome() {
	return "welcome to my First Api";
	}
}